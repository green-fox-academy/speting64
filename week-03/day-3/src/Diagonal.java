import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonal {

    public static void mainDraw(Graphics graphics){

        // draw the canvas' diagonals in green.
        graphics.setColor(Color.RED);
        graphics.drawLine(100, 100, 300, 100);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(300, 100, 300, 300);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(300, 300, 100, 300);
        graphics.setColor(Color.YELLOW);
        graphics.drawLine(100, 300, 100, 100);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(100, 100, 300, 300);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(300, 100, 100, 300);
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
