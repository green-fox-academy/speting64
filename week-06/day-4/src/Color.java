public enum Color {

    BLUE, GREEN, RED, YELLOW;

    static Color colorGenerate(){
        int rand = (int)(Math.random()*4);
        return values()[rand];
    }
}
