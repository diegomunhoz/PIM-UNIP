package controller;

import dao.MovimentoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Movimento;
import view.ExtratoPrincipal;
import view.LoginConta;

public class MovimentoController {

    private ExtratoPrincipal viewExtrato;
    private List<Movimento> listaMovimentos;
    private String texto;

    public MovimentoController(ExtratoPrincipal viewExtrato) {
        this.viewExtrato = viewExtrato;
    }
    
    public void carregarExtrato() {

        int idConta = LoginConta.getInstance().getNumAgencia();
        int idAgencia = LoginConta.getInstance().getNumAgencia();

        Date data = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        this.viewExtrato.getJtfAgencia().setEditable(false);
        this.viewExtrato.getJtfConta().setEditable(false);
        this.viewExtrato.getJtfData().setEditable(false);
        this.viewExtrato.getJtfHorario().setEditable(false);
        this.viewExtrato.getJtfData().setText("" + formatoData.format(data));
        this.viewExtrato.getJtfHorario().setText("" + formatoHora.format(data));
        this.viewExtrato.getJtfAgencia().setText("" + idAgencia);
        this.viewExtrato.getJtfConta().setText("" + idConta);

        texto = "**************************** EXTRATO BANCÁRIO *****************************\n"
                + "AGENCIA: " + idAgencia + "\n"
                + "CONTA..: " + idConta + "\n"
                + "DATA...: " + formatoData.format(data) + "\n"
                + "HORARIO: " + formatoHora.format(data) + "\n"
                + "**********************************************************************************"
                + "\n" + "\n";
        try {
            listaMovimentos = new MovimentoDAO().buscarTodos();
            for (Movimento movimento : listaMovimentos) {
                if (movimento.getContaIdConta().getIdConta().equals(idConta)) {
                    texto = texto + "SERVIÇO.:  " + movimento.getDescricaoServico() + " | VALOR.: R$  " + movimento.getValorMovimento() + " | DATA.:  " + movimento.getDataMovimento() + "\n";
                } else {
                    JOptionPane.showMessageDialog(null, "Não existem lançamentos para esta conta.");
                }
            }
            this.viewExtrato.getjTextArea().setText(texto);
        } catch (Exception ex) {
            Logger.getLogger(MovimentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}