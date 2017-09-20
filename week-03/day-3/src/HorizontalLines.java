import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

    public static void mainDraw(Graphics graphics){
        drawHorizontal(graphics);
    }

    public static void drawHorizontal(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(50, 50, 100, 50);
        graphics.setColor(Color.RED);
        graphics.drawLine(50, 100, 100, 100);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(50, 150, 100, 150);

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
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
