import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int heroPosX;
    int heroPosY;
    String heroImage ="assets/hero-down.png" ;
    Hero cloud;
    int[][] board ={
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
        };

    public Board() {

        heroPosX = 0;
        heroPosY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
        cloud = new Hero();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage floor = new PositionedImage("assets/floor.png", j, i);
                PositionedImage wall = new PositionedImage("assets/wall.png", j, i);
                if (board[i][j] == 0) {
                    floor.draw(graphics);
                } else if (board[i][j] == 1) {
                    wall.draw(graphics);
                }
            }
        }
        //PositionedImage cloud = new PositionedImage(heroImage, heroPosX, heroPosY);
        cloud.draw(graphics);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP && board[cloud.posY-1][cloud.posX] !=1) {
            cloud.posY -= 1;
            //heroImage = "assets/hero-up.png";
            cloud.heroUp();
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && board[cloud.posY+1][cloud.posX] !=1 ) {
            cloud.posY += 1;
            //heroImage = "assets/hero-down.png";
            cloud.heroDown();
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT && board[cloud.posY][cloud.posX-1] !=1) {
            cloud.posX -= 1;
            //heroImage = "assets/hero-left.png";
            cloud.heroLeft();
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT && board[cloud.posY][cloud.posX+1] !=1) {
            cloud.posX += 1;
            //heroImage = "assets/hero-right.png";
            cloud.heroRight();
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}

