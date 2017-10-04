public class HeroStat extends Character {

    public HeroStat() {

        this.setMaxHP(20 + 3 * (d6.turn()));
        this.setCurrentHP(maxHP);
        this.setDefPoint(2 * (d6.turn()));
        this.setStrikePoint(5 + d6.turn());
    }
    public String showStats(){

        return "Hero (Level: " + getLevel() + "| HP: " + getCurrentHP() + "/" + getMaxHP() + "| DP: " + getDefPoint() + "| SP: " + getStrikePoint() + ")";
    }

}

