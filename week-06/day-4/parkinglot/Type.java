public enum Type {

    HONDA, MERCEDES, SEAT, TOYOTA;

    static Type typeGenerate(){
        int rand = (int)(Math.random()*4);
        return values()[rand];
    }
}
