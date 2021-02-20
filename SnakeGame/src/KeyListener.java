import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
    private final Game game;

    public KeyListener(Game game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT && !game.isRight()) {
            game.setLeft(true);
            game.setUp(false);
            game.setDown(false);
        }
        if (key == KeyEvent.VK_RIGHT && !game.isLeft()) {
            game.setRight(true);
            game.setUp(false);
            game.setDown(false);
        }
        if (key == KeyEvent.VK_DOWN && !game.isUp()) {
            game.setRight(false);
            game.setDown(true);
            game.setLeft(false);
        }
        if (key == KeyEvent.VK_UP && !game.isDown()) {
            game.setRight(false);
            game.setUp(true);
            game.setLeft(false);
        }
    }
}
