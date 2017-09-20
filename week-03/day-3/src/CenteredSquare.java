import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

        public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.drawRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.fillRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.drawRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.fillRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.drawRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.fillRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
        graphics.drawRect(WIDTH/2-150, HEIGHT/2-150, WIDTH/2-150,HEIGHT/2-150);
    }

    /*public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }*/

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
