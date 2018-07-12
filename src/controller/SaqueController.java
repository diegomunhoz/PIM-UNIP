package controller;

import dao.ContaDAO;
import dao.MovimentoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conta;
import model.Movimento;
import view.LoginConta;
import view.SaquePrincipal;

public class SaqueController {

    private SaquePrincipal viewSaque;
    private List<Conta> listaContas;
    private Double saldo,
                   sacado;
    private Movimento movimento;

    public SaqueController(SaquePrincipal viewSaque) {
        this.viewSaque = viewSaque;
    }

    public void efetuarSaque(Double saque) {
        int idConta = LoginConta.getInstance().getNumConta();
        int idAgencia = LoginConta.getInstance().getNumAgencia();
        Date data = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");  
        
        try {
            listaContas = new ContaDAO().buscarTodos();
            for (Conta conta : listaContas) {
                if (conta.getIdConta().equals(idConta)) {
                    saldo = conta.getSaldoTotalConta();
                    if (saldo < saque) {
                        JOptionPane.showMessageDialog(null, "SALDO INDISPONIVEL!");
                    } else {
                        sacado = saldo - saque;
                        conta.setSaldoTotalConta(sacado);
                        new ContaDAO().salvar(conta);

                        movimento = new Movimento();
                        movimento.setDataMovimento(new Date());
                        movimento.setHoraMovimento(new Date());
                        movimento.setDescricaoServico("SAQUE");
                        movimento.setValorMovimento(saque);
                        movimento.setContaIdConta(conta);                        
                        new MovimentoDAO().salvar(movimento);

                        JOptionPane.showMessageDialog(null, "SAQUE EFETUADO COM SUCESSO!");
                        this.viewSaque.getJtfValor().setText(null);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(SaqueController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}