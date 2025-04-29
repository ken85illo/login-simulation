import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    public static final int PANEL_WIDTH = 500, PANEL_HEIGHT = 500;
    public static UserInput userName = new UserInput(120, "Username", false);
    public static UserInput password = new UserInput(210, "Password", true);

    public LoginPanel(Window window) {
        super(null);
        this.setBackground(Color.WHITE);
        this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
        this.setLocation((Window.WINDOW_WIDTH - PANEL_WIDTH) / 2, (Window.WINDOW_HEIGHT - PANEL_HEIGHT) / 2 - 40);
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.addTitle();
        this.add(userName);
        this.add(password);
        this.add(new LoginButton(390, this, window));
        this.add(new ShowPassword(325));
    }

    private void addTitle() {
        JPanel titleBG = new JPanel(null);
        titleBG.setBackground(new Color(0x6495ED));
        titleBG.setSize(PANEL_WIDTH - 2, 90);
        titleBG.setLocation(0, 30);

        JLabel title = new JLabel("Welcome!");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 50));
        title.setForeground(Color.WHITE);
        title.setSize(PANEL_WIDTH, 80);
        title.setLocation((PANEL_WIDTH - title.getWidth()) / 2, 25);

        JLabel subTitle = new JLabel("Please login in to your account to continue");
        subTitle.setHorizontalAlignment(JLabel.CENTER);
        subTitle.setFont(new Font("Arial", Font.PLAIN, 15));
        subTitle.setForeground(Color.WHITE);
        subTitle.setSize(PANEL_WIDTH, 120);
        subTitle.setLocation((PANEL_WIDTH - subTitle.getWidth()) / 2, 40);

        this.add(title);
        this.add(subTitle);
        this.add(titleBG);
    }
}
