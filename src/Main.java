import javax.swing.UIManager;
import view.LoginConta;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginConta.getInstance().iniciaTela();
    }
}