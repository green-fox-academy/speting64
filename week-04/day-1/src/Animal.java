/*Create Animal class
Every animal has a hunger value, which is a whole number
                Every animal has a thirst value, which is a whole number
                when creating a new animal object these values are created with the default 50 value
        Every animal can eat() which decreases their hunger by one
        Every animal can drink() which decreases their thirst by one
        Every animal can play() which increases both by one*/

public class Animal {

    int thirst;
    int hunger;

    public Animal(int thirst, int hunger) {
        this.thirst = thirst;
        this.hunger = hunger;
    }

    public Animal() {
        this(50, 50);
    }

    public void drink() {
        thirst--;
    }

    public void eat() {
        hunger--;
    }

    public void play() {
        hunger++;
        thirst++;
    }
}
class Animal2{
        public static void main(String[] args) {

            Animal dog = new Animal();
            System.out.println(dog.hunger);
            dog.eat();
            System.out.println(dog.thirst);
            dog.drink();
            dog.play();
            System.out.println(dog.hunger);
            System.out.println(dog.thirst);
            dog.play();
            dog.play();
            dog.play();
            dog.play();
            System.out.println(dog.hunger);
            System.out.println(dog.thirst);
            dog.eat();
            dog.drink();
            dog.eat();
            dog.drink();
            dog.eat();
            dog.drink();
            dog.eat();
            dog.drink();
            dog.eat();
            dog.drink();
            dog.eat();
            dog.drink();
            dog.eat();
            dog.drink();
            System.out.println(dog.hunger);
            System.out.println(dog.thirst);
    }
}
