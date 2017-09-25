import java.util.ArrayList;

public class Person {

    String name;
    int age;
    String gender;

    public void introduce(){

        System.out.println("Hi I am " + name + " I am " +age + " I am a " + gender);
    }

    public void getGoal() {
        System.out.println("My Goal is : Live for the Moment");
    }

    public Person(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        name = "John Doe";
        age = 30;
        gender = "Male";
    }
}
class Student extends Person {

    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays= skippedDays;
    }
    public Student() {

        name = "Jane Doe";
        age = 30;
        gender = "female ";
        this.previousOrganization = "The School of Life ";
        this.skippedDays = 0;
    }
    public void getGoal(){
        System.out.println("My Goal is : Be a junior software developer.");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }

    public void introduce(){

        System.out.println("Hi, I'm "+ name + " a " +age + " years old " +gender + " from " + previousOrganization + "who skipped "
                + skippedDays +  " days from the course already.");
    }
}
class Mentor extends Person {

    String name;
    int age;
    String gender;
    String level;

    public Mentor(String name, int age, String gender, String level){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level=level;
    }
    public Mentor() {

        name = "Jane Doe";
        age = 30;
        gender = "female ";
        this.level = "Intermediate";
    }
    public void introduce(){

        System.out.println("Hi, I'm "+ name + " a " +age + " years old " +gender + level+ " mentor");
    }

    public void getGoal(){
        System.out.println("My Goal is : Educate brilliant junior software developers.");
    }
}
class Sponsor extends Person {

    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    public void getGoal(){
        System.out.println("My Goal is : Hire brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println("Hi, I'm "+ name + " a " + age + " years old " + gender + "who represents " + company +
                "and hired " + hiredStudents + " students so far");
    }
    public void hire() {
        hiredStudents += 1;
    }

    public Sponsor(String name, int age, String gender, String company){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }
    public Sponsor(){

        name = "Jane Doe";
        age = 30;
        gender = "female ";
        company = "Google";
        hiredStudents = 0;
    }
}
class Main{

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }
        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }
    }
}
