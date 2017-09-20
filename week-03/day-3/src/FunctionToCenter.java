import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){

        int x = 0;
        int y = 0;
        toCenter(graphics,x,y);
    }

    public static void toCenter(Graphics graphics, int x, int y){

        for (int i = 0; i < 20 ; i++) {
            graphics.setColor(Color.BLUE);
            graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
            x += 20;
            y += 20;
        }
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
