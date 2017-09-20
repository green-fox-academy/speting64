import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
        int x;
        int y;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                x = i * 20;
                y = j * 20;
                if((i % 2 ) == (j % 2)){
                    graphics.setColor(new Color(0,0,0));
                }
                else{
                    graphics.setColor(new Color(255,255,255));
                }
                graphics.fillRect(x,y,20,20);
            }
            
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
