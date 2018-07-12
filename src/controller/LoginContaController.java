package controller;

import dao.ContaDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conta;
import view.LoginConta;
import view.MenuCaixaEletronico;

public class LoginContaController {
    
    private ContaDAO dao = new ContaDAO();
    private LoginConta viewLoginConta;
    private List<Conta> listaConta;
    private Conta conta;
    
    public LoginContaController(LoginConta viewLoginConta) {
        this.viewLoginConta = viewLoginConta;
        try {
            this.listaConta = this.dao.buscarTodos();
        } catch (Exception ex) {
            Logger.getLogger(LoginContaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean Logar() {
        int aux = 0;
        for (Conta cont : this.listaConta) {
            if ( cont.getIdConta().equals(Integer.parseInt(this.viewLoginConta.getJtfConta().getText())) &&
                    cont.getSenha().equals(Integer.parseInt(this.viewLoginConta.getJtfSenha().getText()))) {
                this.conta = cont;
                aux = 1;
                break;
            }
        }
        if (aux == 1) {
            return true;
        } else {
            return false;
        }
    }
}