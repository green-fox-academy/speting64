import java.awt.*;

public class Boss extends Character{

    int bossHP;


    public Boss(){
        super();
        maxHP = maxHP + 3*(d6.turn());
        defPoint = 2*(d6.turn());
        strikePoint = 5 + d6.turn();

        this.image = "assets/boss.png";
    }
}
