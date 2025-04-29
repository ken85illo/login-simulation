import java.awt.event.*;
import javax.swing.*;

public class ShowPassword extends JCheckBox implements ActionListener {
    public ShowPassword(int yPosition) {
        this.setText("Show password");
        this.setHorizontalTextPosition(JCheckBox.RIGHT);
        this.setVerticalAlignment(JCheckBox.CENTER);
        this.setSize(150, 20);
        this.setLocation(55, yPosition);
        this.setOpaque(false);
        this.setFocusable(false);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.isSelected())
            LoginPanel.password.getPasswordInput().setEchoChar((char) 0);
        else
            LoginPanel.password.getPasswordInput().setEchoChar('*');
    }
}
