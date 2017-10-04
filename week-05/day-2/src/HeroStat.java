

public class HeroStat extends Character {

    public HeroStat(){

        maxHP = 20 + 3*(d6.turn());
        defPoint = 2*(d6.turn());
        strikePoint = 5+ d6.turn();
    }
}
