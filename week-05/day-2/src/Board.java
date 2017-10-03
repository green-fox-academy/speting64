import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

        int testBoxX;
        int testBoxY;
        int heroPosX;
        int heroPosY;
        String filename;

        public Board() {

            testBoxX = 0;
            testBoxY = 0;
            // set the size of your draw board
            setPreferredSize(new Dimension(720, 720));
            setVisible(true);
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            //graphics.fillRect(testBoxX, testBoxY, 0, 0);
            PositionedImage tile = new PositionedImage("Assets/floor.png",0 ,0 );
            //tile.draw(graphics);
            for (int i = 0; i < 10 ; i++) {
                    for (int j = 0; j < 11 ; j++) {
                        tile.posX = i * 72;
                        tile.posY = j * 72;
                        tile.draw(graphics);
                    }
            }
            int walls[][] = new int[][]{
                    {0,0,0,1,0,1,0,0,0,0},
                    {0,0,0,1,0,1,0,1,1,0},
                    {0,1,1,1,0,1,0,1,1,0},
                    {0,0,0,0,0,1,0,0,0,0},
                    {1,1,1,1,0,1,1,1,1,0},
                    {0,1,0,1,0,0,0,0,1,0},
                    {0,1,0,1,0,1,1,0,1,0},
                    {0,0,0,0,0,1,1,0,1,0},
                    {0,1,1,1,0,0,0,0,1,0},
                    {0,0,0,1,0,1,1,0,1,0},

            };

            for (int i = 0; i <walls.length ; i++) {
                for (int j = 0; j <walls.length ; j++) {
                    if(walls[i][j] == 1){
                        PositionedImage wall = new PositionedImage("C:\\Users\\Viktorlukács\\Wanderer\\Assets\\wall.png",j*72 ,i*72 );
                        wall.draw(graphics);
                    }
                }
            }
            //graphics.fillRect(testBoxX, testBoxY, 100, 100);
            //PositionedImage hero = new PositionedImage("Assets/hero-down.png", 0, 0);

            HeroPosition hero = new HeroPosition("Assets/hero-down.png", testBoxX, testBoxY);
            for (int i = 0; i < walls.length ; i++) {
                hero.draw(graphics);
            }
            hero.draw(graphics);
        }

        public static void main(String[] args) {
            // Here is how you set up a new window and adding our board to it
            JFrame frame = new JFrame("RPG Game");
            Board board = new Board();
            frame.add(board);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.pack();
            // Here is how you can add a key event listener
            // The board object will be notified when hitting any key
            // with the system calling one of the below 3 methods
            frame.addKeyListener(board);
            // Notice (at the top) that we can only do this
            // because this Board class (the type of the board object) is also a KeyListener
        }

        // To be a KeyListener the class needs to have these 3 methods in it
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
            if (e.getKeyCode() == KeyEvent.VK_UP) {
               testBoxY -= 72;
               filename = "Assets/hero-up.png";

            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                testBoxY += 72;

            }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                testBoxX -= 72;

            }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                testBoxX += 72;

            }                // and redraw to have a new picture with the new coordinates
            repaint();
        }
}



