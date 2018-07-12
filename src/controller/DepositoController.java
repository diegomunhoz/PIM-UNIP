package controller;

import dao.ContaDAO;
import dao.MovimentoDAO;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conta;
import model.Movimento;
import view.DepositoPrincipal;

public class DepositoController {

    private DepositoPrincipal viewDeposito;
    private List<Conta> listaContas;
    private Double deposito;
    private Movimento movimento;

    public DepositoController(DepositoPrincipal viewDeposito) {
        this.viewDeposito = viewDeposito;
    }

    public void efetuarDeposito() {
        int idConta = Integer.parseInt(this.viewDeposito.getJtfConta().getText());
        int idAgencia = Integer.parseInt(this.viewDeposito.getJtfAgencia().getText());
        try {
            listaContas = new ContaDAO().buscarTodos();
            for (Conta conta : listaContas) {
                if (conta.getIdConta().equals(idConta) && conta.getAgenciaIdAgencia().getIdAgencia().equals(idAgencia)) {
                    if (this.viewDeposito.getJtfValorDeposito().getText().equals(null)) {
                        JOptionPane.showConfirmDialog(null, "E NECESSÁRIO INFORMAR O VALOR!");
                    }else{
                        deposito = Double.parseDouble(this.viewDeposito.getJtfValorDeposito().getText());
                        double saldo = conta.getSaldoTotalConta();
                        saldo = saldo + deposito;
                        conta.setSaldoTotalConta(saldo);
                        new ContaDAO().salvar(conta);

                        movimento = new Movimento();
                        movimento.setDataMovimento(new Date());
                        movimento.setHoraMovimento(new Date());
                        movimento.setDescricaoServico("DEPOSITO");
                        movimento.setValorMovimento(deposito);
                        movimento.setContaIdConta(conta);                        
                        new MovimentoDAO().salvar(movimento);
                        
                        JOptionPane.showMessageDialog(null, "DEPOSITO EFETUADO COM SUCESSO!");   
                        this.viewDeposito.getJtfAgencia().setText(null);
                        this.viewDeposito.getJtfConta().setText(null);
                        this.viewDeposito.getJtfValorDeposito().setText(null);
                        this.viewDeposito.getjComboBox1().setSelectedIndex(0);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "AGENCIA E CONTA NÃO CADASTRADA");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DepositoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}