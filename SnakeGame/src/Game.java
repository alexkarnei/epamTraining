import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JPanel implements ActionListener {
    private final int SIZE = 480;
    private final int SNAKE_DOT_SIZE = 16;
    private final int ALL_DOTS = 900;
    private Image snakeDot;
    private Image apple;
    private Image wall;
    private int wallX;
    private int wallY;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int snakeDots;
    private Timer timer;
    private Timer timerWall;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    public Game() {
        setBackground(Color.BLACK);
        loadImage();
        initGame();
        addKeyListener(new KeyListener(this));
        setFocusable(true);
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    private void initGame() {
        snakeDots = 3;
        for (int i = 0; i < snakeDots; i++) {
            x[i] = 64 - i * SNAKE_DOT_SIZE;
            y[i] = 64;
        }
        timer = new Timer(250, this);
        timer.start();
        createApple();
        createWall();
    }

    private void createApple() {
        appleX = new Random().nextInt(20) * SNAKE_DOT_SIZE;
        appleY = new Random().nextInt(20) * SNAKE_DOT_SIZE;
    }

    private void createWall() {
        wallX = new Random().nextInt(10) * SNAKE_DOT_SIZE;
        wallY = new Random().nextInt(10) * SNAKE_DOT_SIZE;
    }

    public void loadImage() {
        ImageIcon appleImage = new ImageIcon("appleicon.png");
        apple = appleImage.getImage();
        ImageIcon snakeImage = new ImageIcon("snakeicon.png");
        snakeDot = snakeImage.getImage();
        ImageIcon wallImage = new ImageIcon("wall.png");
        wall = wallImage.getImage();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this);
            g.drawImage(wall, wallX, wallY, this);
            for (int i = 0; i < snakeDots; i++) {
                g.drawImage(snakeDot, x[i], y[i], this);
            }
        } else {
            String str = new String("Game over!");
            g.setColor(Color.white);
            setBackground(Color.RED);
            g.drawString(str, 200, SIZE / 2);;
        }
    }

    public void move() {
        for (int i = snakeDots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (left) {
            x[0] -= SNAKE_DOT_SIZE;
        }
        if (right) {
            x[0] += SNAKE_DOT_SIZE;
        }
        if (up) {
            y[0] -= SNAKE_DOT_SIZE;
        }
        if (down) {
            y[0] += SNAKE_DOT_SIZE;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkColisions();
            checkWall();
            move();
        }
        repaint();
    }

    private void checkWall() {
        if (x[0] == wallX && y[0] == wallY) {
            inGame = false;
        }
    }

    private void checkColisions() {
        for (int i = snakeDots; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        if (x[0] > SIZE) {
            inGame = false;
        }
        if (x[0] < 0) {
            inGame = false;
        }
        if (y[0] > SIZE) {
            inGame = false;
        }
        if (y[0] < 0) {
            inGame = false;
        }
    }

    private void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            snakeDots++;
            createApple();
            createWall();
        }
    }

}
