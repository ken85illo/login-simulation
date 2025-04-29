import java.awt.*;
import javax.swing.*;

public class UserInput extends JLabel {
    private JTextField input;
    private JPasswordField passwordField;

    public UserInput(int yPosition, String text, boolean isPassword) {
        this.setText(text);
        this.setFont(new Font("Arial", Font.BOLD, 18));
        this.setForeground(Color.BLACK);
        this.setSize(380, 110);
        this.setLayout(new BorderLayout());
        this.setLocation((Window.PANEL_WIDTH - this.getSize().width) / 2, yPosition);

        if(isPassword)
            addPasswordField();
        else
            addTextField();
    }

    private void addTextField() {
        input = new JTextField();
        input.setPreferredSize(new Dimension(200, 40));
        input.setFont(new Font("Arial", Font.PLAIN, 18));
        input.setBackground(Color.WHITE);
        input.setForeground(Color.BLACK);
        this.add(input, BorderLayout.SOUTH);
    }

    private void addPasswordField() {
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 40));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);
        passwordField.setEchoChar('*');
        this.add(passwordField, BorderLayout.SOUTH);
    }

    public String getInput() {
        if(passwordField == null)
            return input.getText();

        return String.valueOf(passwordField.getPassword());
    }

    public JTextField getNameInput() {
        return input;
    }

    public JPasswordField getPasswordInput() {
        return passwordField;
    }
}

