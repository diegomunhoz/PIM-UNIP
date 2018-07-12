package controller;

import dao.ContaDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conta;
import view.SaldoPrincipal;
import view.LoginConta;

public class SaldoController {

    private SaldoPrincipal viewSaldo;
    private List<Conta> listaContas;

    public SaldoController(SaldoPrincipal viewSaldo) {
        this.viewSaldo = viewSaldo;
    }

    public void carregarSaldo() {
       
        int idConta = LoginConta.getInstance().getNumConta();
        int idAgencia = LoginConta.getInstance().getNumAgencia();

        Date data = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");  
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");  
        
        
        this.viewSaldo.getJtfAgencia().setEditable(false);
        this.viewSaldo.getJtfConta().setEditable(false);
        this.viewSaldo.getJtfData().setEditable(false);
        this.viewSaldo.getJtfHorario().setEditable(false);
        this.viewSaldo.getJtfSaldoTotal().setEditable(false);
        
        try {
            listaContas = new ContaDAO().buscarTodos();
            
            for (Conta conta : listaContas) {
                
                if(conta.getAgenciaIdAgencia().getIdAgencia().equals(idAgencia) && conta.getIdConta().equals(idConta)){
                    this.viewSaldo.getJtfSaldoTotal().setText("" + conta.getSaldoTotalConta());
                    this.viewSaldo.getJtfAgencia().setText("" + idAgencia);
                    this.viewSaldo.getJtfConta().setText("" + idConta);
                    this.viewSaldo.getJtfData().setText("" + formatoData.format(data));
                    this.viewSaldo.getJtfHorario().setText("" + formatoHora.format(data));
                    break;
                }   
            }
        } catch (Exception ex) {
            Logger.getLogger(SaldoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}