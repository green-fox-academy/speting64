import java.awt.*;

public class Character {

    int maxHP;
    int currentHP;
    int defPoint;
    int strikePoint;
    int x;
    int y;
    int level;

    String image;

    Turn d6 = new Turn();

    public Character(){

        this.x = (int)(Math.random() * 10);
        this.y = (int)(Math.random() * 10);
    }

    public void spawn(){

        this.x = (int)(Math.random() * 10);
        this.y = (int)(Math.random() * 10);
    }

    public void moveChar(int movement){

        if (movement == 0){
            this.x--;
        }else if (movement == 2){
            this.y++;
        }else if (movement == 1){
            this.y--;
        }
    }

    /*public void drawStats(Graphics graphics){

        graphics.setFont(new Font("Arial", Font.BOLD , 20));
        graphics.drawString("Hero (Level" );
    }*/

    public Boolean isDead(){

        if(this.currentHP < 1){
            return true;
        }
        return false;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public void setMaxHP(int maxHP){
        this.maxHP = maxHP;
    }

    public int getCurrentHP(){
        return currentHP;
    }

    public void setCurrentHP(int currentHP){
        this.currentHP = currentHP;
    }

    public int getDefPoint(){
        return defPoint;
    }

    public void setDefPoint(int defPoint){
        this.defPoint = defPoint;
    }

    public int getStrikePoint(){
        return strikePoint;
    }

    public void setStrikePoint(int strikePoint){
        this.strikePoint = strikePoint;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

}
