import java.awt.*;

public class Boss extends PositionedImage{

    int bossTile;

    public Boss(String filename , int posX , int posY){

        super("assets/boss.png" , posX , posY);
    }

    public void moving(Graphics graphics){

    }
}
