package practiceDeitel;

import javax.swing.*;

public class UsernameAndPassword {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Username");
        String password = JOptionPane.showInputDialog("Password");

        if (username != null & password != null&&(username.equals("Lekan") && password.equals("Lekan"))|| (username.equals("Chibuzo") && password.equals("Chibuzor"))
    ){
            JOptionPane.showMessageDialog(null,"You are in");
        }
        else {
            JOptionPane.showMessageDialog(null,"You are suspicious");
        }
    }
}
