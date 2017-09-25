public class Mentor {

    String name;
    int age;
    String gender;
    String level;

    public Mentor(String level){

        this.level=level;
    }
    public Mentor() {
        this.level = "Intermediate";

    }
    public void getGoal(){
        System.out.println("My Goal is : Educate brilliant junior software developers.");
    }
    public void introduce(){
        Mentor jane = new Mentor();
        jane.name = "Jane Doe";
        jane.age = 30;
        jane.gender = "female ";
        jane.level = "Intermediate";
        System.out.println("Hi, I'm "+ jane.name + " a " +jane.age + " years old " + jane.gender + jane.level+ " mentor");
    }
}
class Doe{

    public static void main(String[] args) {
        Mentor jane = new Mentor();
        jane.name = "Jane Doe";
        jane.age = 30;
        jane.gender = "Female";
        jane.introduce();
        jane.getGoal();
        System.out.println("Name: "+ jane.name+ " Age: "+ jane.age + " Gender: "+ jane.gender + " Level: " + jane.level);
    }

}
