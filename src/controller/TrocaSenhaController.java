package controller;

import dao.ContaDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conta;
import view.TrocaSenhaPrincipal;
import view.LoginConta;

public class TrocaSenhaController {

    private TrocaSenhaPrincipal viewTrocaSenha;
    private List<Conta> listaContas;
    
    public TrocaSenhaController(TrocaSenhaPrincipal viewTrocaSenha) {
        this.viewTrocaSenha = viewTrocaSenha;
    }

    public void trocarSenha() {
        int idConta = LoginConta.getInstance().getNumConta();
        try {
            listaContas = new ContaDAO().buscarTodos();
            for (Conta conta : listaContas) {
                if (conta.getIdConta().equals(idConta)) {
                    if (conta.getSenha().equals(Integer.parseInt(this.viewTrocaSenha.getJtfSenhaAnterior().getText()))) {
                        if (this.viewTrocaSenha.getJtfNovaSenha().getText().equals(this.viewTrocaSenha.getJtfConfirmaSenha().getText())) {
                            conta.setSenha(Integer.parseInt(this.viewTrocaSenha.getJtfConfirmaSenha().getText()));
                            new ContaDAO().salvar(conta);
                            JOptionPane.showMessageDialog(null, "SENHA ALTERADA COM SUCESSO");
                            this.viewTrocaSenha.getJtfConfirmaSenha().setText(null);
                            this.viewTrocaSenha.getJtfNovaSenha().setText(null);
                            this.viewTrocaSenha.getJtfSenhaAnterior().setText(null);
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "NOVAS SENHAS DIFERENTES, DIGITE NOVAMENTE");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "SENHA ANTERIOR INCORRETA");
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(TrocaSenhaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}