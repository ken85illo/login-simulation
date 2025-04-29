import java.awt.*;

import javax.swing.*;

public class LoginStatus extends JPanel {
    public static final int PANEL_WIDTH = 500, PANEL_HEIGHT = 250;

    public LoginStatus() {
        super(null);
        this.setBackground(Color.WHITE);
        this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
        this.setLocation((Window.WINDOW_WIDTH - PANEL_WIDTH) / 2, (Window.WINDOW_HEIGHT - PANEL_HEIGHT) / 2 - 40);
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.addTitle();
    }

    private void addTitle() {
        JPanel titleBG = new JPanel(null);
        titleBG.setSize(PANEL_WIDTH - 2, 150);
        titleBG.setLocation(0, (PANEL_HEIGHT - titleBG.getHeight())/ 2);

        JLabel title = new JLabel();
        JLabel subTitle = new JLabel();
        if(LoginPanel.userName.getInput().equals("user") && LoginPanel.password.getInput().equals("password")) {
            title.setText("Login Successful!");
            subTitle.setText("You have successfully signed into your account.");
            titleBG.setBackground(new Color(0x50C878));
        }
        else {
            title.setText("Login Failed!");
            subTitle.setText("You have entered an incorrect name or password.");
            titleBG.setBackground(new Color(0xC41E3A));
        }

        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 50));
        title.setSize(PANEL_WIDTH, 80);
        title.setForeground(Color.WHITE);
        title.setLocation((PANEL_WIDTH - title.getWidth()) / 2, 70);

        subTitle.setHorizontalAlignment(JLabel.CENTER);
        subTitle.setFont(new Font("Arial", Font.PLAIN, 15));
        subTitle.setForeground(Color.WHITE);
        subTitle.setSize(PANEL_WIDTH, 120);
        subTitle.setLocation((PANEL_WIDTH - subTitle.getWidth()) / 2, 95);

        this.add(title);
        this.add(subTitle);
        this.add(titleBG);
    }

}
