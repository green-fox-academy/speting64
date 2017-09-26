public class Input{

    public static void main(String[] args) {

        Plant yellow = new Flower();
        Plant blue = new Flower();
        yellow.name = "Yellow Flower";
        blue.name = " Blue Flower";
        Plant purple = new Tree();
        Plant orange = new Tree();
        purple.name = "purple Tree";
        orange.name = " Orange Tree";

        Garden thisGarden = new Garden();

        thisGarden.add(yellow);
        thisGarden.add(blue);
        thisGarden.add(purple);
        thisGarden.add(orange);

    }
}
