import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Random;

public class Sierpinksi {
    public static void mainDraw(Graphics graphics){
        int x =50;
        int y = 50;
        int r = 600;
        int cnt = 12;
        recursionDraw(graphics,x,y,r,cnt);
    }
    public static void recursionDraw(Graphics graphics, int x , int y , int r , int cnt){

        Random rand = new Random();
        float red = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x,y,r,r);
        if(cnt>16){
            return;
        }
            graphics.setColor(new Color(red, g, b));
            graphics.fillRect(x + r / 3, y + r / 3, r / 3, r / 3);

            recursionDraw(graphics, x, y, r / 3, cnt + 1);
            recursionDraw(graphics, x + r / 3, y, r / 3, cnt + 1);
            recursionDraw(graphics, x + 2 * r / 3, y, r / 3, cnt + 1);
            recursionDraw(graphics, x, y + r / 3, r / 3, cnt + 1);
            recursionDraw(graphics, x, y + 2 * r / 3, r / 3, cnt + 1);
            recursionDraw(graphics, x + 2 * r / 3, y + r / 3, r / 3, cnt + 1);
            recursionDraw(graphics, x + r / 3, y + 2 * r / 3, r / 3, cnt + 1);
            recursionDraw(graphics, x + 2 * r / 3, y + 2 * r / 3, r / 3, cnt + 1);
    }
    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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



