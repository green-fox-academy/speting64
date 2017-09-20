import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

// create a line drawing function that takes 2 parameters:
// the x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// draw 3 lines with that function.

public class GoToCenter {

    public static void mainDraw(Graphics graphics){
        drawLines(graphics);
    }

    public static void drawLines(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.drawLine(50, 0, 100, 200);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(100, 0, 100, 200);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(150, 0, 100, 200);
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
