import java.util.ArrayList;

public class FleetOfThings {

    public static void main(String[] args) {
        //FleetOfThings fleet = new FleetOfThings();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Fleet fleet = new Fleet();

        Thing thing1 = new Thing("Get Milk");
        Thing thing2 = new Thing ("Remove the obstacles");
        Thing thing3 = new Thing ("Stand up");
        Thing thing4 = new Thing ("Eat Lunch");

        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);

        thing3.complete();
        thing4.complete();

        System.out.println(fleet);
    }
}
