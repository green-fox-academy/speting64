import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(50, 50, 100,100);
        graphics.drawRect(50, 50, 100,100);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(100, 100, 100,200);
        graphics.drawRect(100, 100, 100,200);
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(150, 150, 200,150);
        graphics.drawRect(150, 150, 200,150);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(200, 200,300,300);
        graphics.drawRect(200, 200,300,300);
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
