public class Person {
    String name;
    int age;
    String gender;

    public Person() {
        this.name = "John Doe";
        this.age = 30;
        this.gender = "Male";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        Person person = new Person();
        person.name = "John Doe";
        person.age = 30;
        person.gender = "Male";
        System.out.println("Hi I am " + person.name + " I am " + person.age + " I am a " + person.gender);
    }

    public void getGoal() {
        System.out.println("My Goal is : Live for the Moment");
    }
}
class John{
    public static void main(String[] args) {
        Person john = new Person();
        john.introduce();
        john.getGoal();
        System.out.println("Name: "+ john.name+ " Age: "+ john.age + " Gender: "+ john.gender);


    }

}
