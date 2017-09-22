import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Random;

public class Koch1 {

    public static void mainDraw(Graphics graphics){
        int depth = 7;
        int x1 = 20;
        int y1 = 280;
        int x2 = 160;
        int y2 = 40;
        int x3 = 300;
        int y3 = 280;
        kochDraw(graphics,depth, x1 , y1, x3 , y3);
        kochDraw(graphics,depth, x2 , y2, x1 , y1);
        kochDraw(graphics,depth, x3 , y3, x2 , y2);
    }

    public static void kochDraw(Graphics graphics, int depth , int x1 , int y1 , int x5, int y5){

        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        int dx,dy,x2,y2,x3,y3,x4,y4;
        if (depth==1){
            graphics.setColor(new Color(r, g, b));
            graphics.drawLine(x1,y1,x5,y5);
        }
        else{
            dx = x5-x1;
            dy = y5-y1;
            x2 = x1 + dx/3;
            y2 = y1 + dy/3;
            x3 = (int)((x1+ x5) / 2 + (Math.sqrt(3.0) / 6) * (y1 - y5));
            y3 = (int)((y1 + y5) / 2 + (Math.sqrt(3.0) / 6) * (x5 - x1));
            x4 = x1 + dx * 2 / 3;
            y4 = y1 + dy * 2 / 3;
            graphics.setColor(new Color(r, g, b));
            kochDraw(graphics,depth-1, x1 , y1, x2 , y2);
            kochDraw(graphics,depth-1, x2 , y2, x3 , y3);
            kochDraw(graphics,depth-1, x3 , y3, x4 , y4);
            kochDraw(graphics,depth-1, x4 , y4, x5 , y5);
        }
    }
    //    Don't touch the code below
    static int WIDTH = 1200;
    static int HEIGHT = 1200;

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
