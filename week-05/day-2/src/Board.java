import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int heroPosX;
    int heroPosY;
    String heroImage ="assets/hero-down.png" ;
    Hero cloud;
    HeroStat stat;
    Skeleton skeleton1;
    Skeleton skeleton2;
    Boss boss;
    List <Character> fiends;
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
        skeleton1 = new Skeleton();
        skeleton2 = new Skeleton();
        boss = new Boss();
        stat = new HeroStat();
        fiends = new ArrayList<>(Arrays.asList(skeleton1,skeleton2,boss));
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

        for (Character c :fiends){
            while(board[c.y][c.x] !=0){
                c.spawn();
            }
        }

        PositionedImage skel1 = new PositionedImage(skeleton1.image,skeleton1.x,skeleton1.y);
        skel1.draw(graphics);
        PositionedImage skel2 = new PositionedImage(skeleton2.image,skeleton2.x,skeleton2.y);
        skel2.draw(graphics);
        PositionedImage bossama = new PositionedImage(boss.image,boss.x,boss.y);
        bossama.draw(graphics);

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0,700,400,30);
        graphics.setColor(Color.BLACK);
        graphics.drawString(stat.showStats(),10,707);


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

