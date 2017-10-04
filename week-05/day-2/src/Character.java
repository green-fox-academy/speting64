public class Character {

    int maxHP;
    int currentHP;
    int defPoint;
    int strikePoint;
    int x;
    int y;

    String image;

    Turn roll = new Turn();

    public Character(){

        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.defPoint = defPoint;
        this.strikePoint = strikePoint;

        this.x = (int)(Math.random() * 10);
        this.y = (int)(Math.random() * 10);
    }

    public void spawn(){

        this.x = (int)(Math.random() * 10);
        this.y = (int)(Math.random() * 10);
    }

    public Boolean isDead(){

        if(this.currentHP < 1){
            return true;
        }
        return false;
    }
}
