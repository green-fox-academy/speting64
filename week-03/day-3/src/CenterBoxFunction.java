import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Scanner;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){

        Scanner sc = new Scanner (System.in);
        int lin = sc.nextInt();

        posSquare(graphics , lin , lin , lin);
    }

    static void posSquare(Graphics graphics, int wi, int ht , int lin){
        graphics.setColor(new Color(2,172,30));
        graphics.drawRect((wi/2)-(lin/2),(ht/2)-(lin/2),lin,lin);
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
