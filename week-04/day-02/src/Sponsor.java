public class Sponsor {

    String name;
    int age;
    String gender;
    String level;
    String company;
    int hiredStudents;

    public Sponsor(String level){

        this.company = company;
        this.hiredStudents = 0;
    }
    public Sponsor() {

        this.company = "Microsoft";
        this.hiredStudents =0;

    }
    public void getGoal(){
        System.out.println("My Goal is : Hire brilliant junior software developers.");
    }
    public void introduce(){
        Sponsor google = new Sponsor();
        google.name = "Jane Doe";
        google.age = 30;
        google.gender = "female ";
        google.company = "Google ";

        System.out.println("Hi, I'm "+ google.name + " a " + google.age + " years old " + google.gender + "who represents " + google.company +
                "and hired " + hiredStudents + " students so far");
    }
    public void hire(){

        hiredStudents += 1;
    }
}
class Company{
    public static void main(String[] args) {
        Sponsor google = new Sponsor();
        google.name = "Jane Doe";
        google.age = 30;
        google.gender = "female ";
        google.company = "Google ";
        google.introduce();
        google.getGoal();
        google.hire();
        System.out.println("Name: " + google.name + ",Age: " + google.age + ",Gender: " + google.gender + ",Company: " +google.company + ",Hired Students:" +google.hiredStudents);
    }

}
