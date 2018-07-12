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
import view.TransferenciaPrincipal;
import view.LoginConta;

public class TransferenciaController {

    private TransferenciaPrincipal viewTransferencia;
    private List<Conta> listaContas;
    private Double transferencia;
    ;
    private Movimento movimento;
    private int aux;
    private int idContaTransferencia;
    private int idAgenciaTransferencia;
    private int idContaAtual;
    private int idAgenciaAtual;

    public TransferenciaController(TransferenciaPrincipal viewTransferencia) {
        this.viewTransferencia = viewTransferencia;
    }

    public void efetuarTransferencia() {
        idContaTransferencia = Integer.parseInt(this.viewTransferencia.getJtfConta().getText());
        idAgenciaTransferencia = Integer.parseInt(this.viewTransferencia.getJtfAgencia().getText());
        idContaAtual = LoginConta.getInstance().getNumConta();
        idAgenciaAtual = LoginConta.getInstance().getNumAgencia();

        if (idContaTransferencia == idContaAtual && idAgenciaAtual == idAgenciaTransferencia) {
            JOptionPane.showMessageDialog(null, "NÃO É PERMITIDO TRANSFERENCIA PARA MESMA CONTA");
        } else {
            if (efetuaDesconto()) {
                efetuaCredito();
            }
        }
    }

    public boolean efetuaDesconto() {
        idContaTransferencia = Integer.parseInt(this.viewTransferencia.getJtfConta().getText());
        idAgenciaTransferencia = Integer.parseInt(this.viewTransferencia.getJtfAgencia().getText());
        idContaAtual = LoginConta.getInstance().getNumConta();
        idAgenciaAtual = LoginConta.getInstance().getNumAgencia();

        transferencia = Double.parseDouble(this.viewTransferencia.getJtfValorTransferencia().getText());
        try {
            listaContas = new ContaDAO().buscarTodos();
            for (Conta conta : listaContas) {
                if (conta.getIdConta().equals(idContaAtual) && conta.getAgenciaIdAgencia().getIdAgencia().equals(idAgenciaAtual)) {
                    double saldo = conta.getSaldoTotalConta();
                    saldo = saldo - transferencia;
                    if (saldo < 0) {
                        JOptionPane.showMessageDialog(null, "SALDO INDISPONIVEL!");
                        aux = 1;
                        break;

                    } else {
                        conta.setSaldoTotalConta(saldo);
                        new ContaDAO().salvar(conta);

                        movimento = new Movimento();
                        movimento.setDataMovimento(new Date());
                        movimento.setHoraMovimento(new Date());
                        movimento.setDescricaoServico("TRANSFERENCIA");
                        movimento.setValorMovimento(transferencia);
                        movimento.setContaIdConta(conta);
                        new MovimentoDAO().salvar(movimento);
                        aux = 0;
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(TransferenciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (aux == 1) {
            return false;
        } else {
            return true;
        }

    }

    public void efetuaCredito() {
        idContaTransferencia = Integer.parseInt(this.viewTransferencia.getJtfConta().getText());
        idAgenciaTransferencia = Integer.parseInt(this.viewTransferencia.getJtfAgencia().getText());
        idContaAtual = LoginConta.getInstance().getNumConta();
        idAgenciaAtual = LoginConta.getInstance().getNumAgencia();
        transferencia = Double.parseDouble(this.viewTransferencia.getJtfValorTransferencia().getText());
        try {
            listaContas = new ContaDAO().buscarTodos();
            for (Conta conta : listaContas) {
                if (conta.getIdConta().equals(idContaTransferencia) && conta.getAgenciaIdAgencia().getIdAgencia().equals(idAgenciaTransferencia)) {
                    if (this.viewTransferencia.getJtfValorTransferencia().getText().equals(null)) {
                        JOptionPane.showConfirmDialog(null, "E NECESSÁRIO INFORMAR O VALOR!");
                    } else {
                        double saldo = conta.getSaldoTotalConta();
                        saldo = saldo + transferencia;
                        conta.setSaldoTotalConta(saldo);
                        new ContaDAO().salvar(conta);

                        movimento = new Movimento();
                        movimento.setDataMovimento(new Date());
                        movimento.setHoraMovimento(new Date());
                        movimento.setDescricaoServico("TRANSFERENCIA");
                        movimento.setValorMovimento(transferencia);
                        movimento.setContaIdConta(conta);
                        new MovimentoDAO().salvar(movimento);

                        JOptionPane.showMessageDialog(null, "TRANSFERENCIA EFETUADA COM SUCESSO!");
                        this.viewTransferencia.getJtfAgencia().setText(null);
                        this.viewTransferencia.getJtfConta().setText(null);
                        this.viewTransferencia.getJtfValorTransferencia().setText(null);
                        break;
                    }
                
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(TransferenciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}