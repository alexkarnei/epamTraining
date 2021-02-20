import javax.swing.*;

public class MainGameWindow extends JFrame {

    public MainGameWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(480, 505);
        setLocation(500, 150);
        add(new Game());
        setVisible(true);
    }

    public static void main(String[] args) {

        MainGameWindow gameWindow = new MainGameWindow();
    }
}
