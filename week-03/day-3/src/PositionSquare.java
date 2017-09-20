import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void posSquare(Graphics graphics, int x, int y ){
        graphics.fillRect(x,y,50,50);
    }

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.BLUE);
        posSquare(graphics,50,50);

        graphics.setColor(Color.YELLOW);
        posSquare(graphics,168,167);

        graphics.setColor(new Color(2,172,30));
        posSquare(graphics,110,110);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
