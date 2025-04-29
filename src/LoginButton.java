import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Timer;
import java.util.TimerTask;

public class LoginButton extends JButton implements ActionListener {
    private Window window;
    private LoginStatus loginStatus;
    private Timer timer;

    public LoginButton(int yPosition, JPanel panel, Window window) {
        this.window = window;
        this.setBackground(new Color(0x6495ED));
        this.setForeground(Color.WHITE);
        this.setSize(200, 50);
        this.setLocation((panel.getWidth() - this.getWidth()) / 2, yPosition);
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setText("Login");
        this.setFocusable(false);
        this.setBorder(BorderFactory.createEtchedBorder());
        this.addActionListener(this);
        this.timer = new Timer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            if (LoginPanel.userName.getInput().isEmpty() || LoginPanel.password.getInput().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill out all the fields!", "MISSING INPUT",
                        JOptionPane.ERROR_MESSAGE);
                timer.schedule(exit, 5000);
            } else {
                this.loginStatus = new LoginStatus();
                Window.layeredPane.remove(Window.loginPanel);
                Window.layeredPane.add(loginStatus, Integer.valueOf(1));
                window.repaint();
                if (LoginPanel.userName.getInput().equals("user") && LoginPanel.password.getInput().equals("password"))
                    timer.schedule(exit, 5000);
                else
                    timer.schedule(restart, 5000);
            }
        }
    }

    private TimerTask restart = new TimerTask() {
        @Override
        public void run() {
            Window.layeredPane.remove(loginStatus);
            Window.layeredPane.add(Window.loginPanel, Integer.valueOf(1));
            JOptionPane.showMessageDialog(null, "Please type again your credentials", "INCORRECT CREDENTIALS",
                    JOptionPane.INFORMATION_MESSAGE);
            window.repaint();
        }
    };

    private TimerTask exit = new TimerTask() {
        @Override
        public void run() {
            System.exit(0);
        }
    };
}
