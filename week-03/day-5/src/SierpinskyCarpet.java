import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet extends JPanel {

    void recursionDraw(Graphics graphics, int x , int y , int r , int cnt ){

        if (cnt > 5){
            return;
        }
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x,y,r,r);

        graphics.setColor(new Color(255,251,0));
        graphics.fillRect(x+r/3, y+r/3, r/3, r/3);

        recursionDraw(graphics, x, y, r/3, cnt+1);
        recursionDraw(graphics, x+r/3, y, r/3, cnt+1);
        recursionDraw(graphics, x+2*r/3, y, r/3, cnt+1);
        recursionDraw(graphics, x, y+r/3, r/3, cnt+1);
        recursionDraw(graphics, x, y+2*r/3, r/3, cnt+1);
        recursionDraw(graphics, x+2*r/3, y+r/3, r/3, cnt+1);
        recursionDraw(graphics, x+r/3, y+2*r/3, r/3, cnt+1);
        recursionDraw(graphics, x+2*r/3, y+2*r/3, r/3, cnt+1);
    }

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
        }
    }
}



