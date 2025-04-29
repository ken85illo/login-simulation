import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    public static final int WINDOW_WIDTH = 1280, WINDOW_HEIGHT = 720;
    public static final int PANEL_WIDTH = 500, PANEL_HEIGHT = 500;

    public static JLayeredPane layeredPane;
    public static LoginPanel loginPanel;

    public static void main(String[] args) {
        Window window = new Window();
        layeredPane = new JLayeredPane();
        loginPanel = new LoginPanel(window);
        layeredPane.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        background.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        layeredPane.add(background, Integer.valueOf(0));
        layeredPane.add(loginPanel, Integer.valueOf(1));
        window.add(layeredPane);
        window.setVisible(true);
    }

    private Window() {
        this.setTitle("Login Simulation");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.getContentPane().setBackground(new Color(0x89CFF0));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
