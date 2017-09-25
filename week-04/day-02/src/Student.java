public class Student {

    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(String previousOrganization, int skippedDays){
        this.previousOrganization = previousOrganization;
        this.skippedDays= skippedDays;
    }
    public Student() {
        this.previousOrganization = "The School of Life ";
        this.skippedDays = 0;
    }
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }
    public void introduce(){
        Student jane = new Student();
        jane.name = "Jane Doe";
        jane.age = 30;
        jane.gender = "Female";
        System.out.println("Hi, I'm "+ jane.name + " a " +jane.age + " years old " +jane.gender + " from " + jane.previousOrganization + "nwho skipped "
                + jane.skippedDays +  " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }
}
class Jane {
    public static void main(String[] args){
        Student jane = new Student();
        jane.name = "Jane Doe";
        jane.age = 30;
        jane.gender = "Female";
        jane.introduce();
        jane.getGoal();
        jane.skipDays(2);
        System.out.println("Skipped days:"+ jane.skippedDays);
        System.out.println("Name: "+ jane.name+ " Age: "+ jane.age + " Gender: "+ jane.gender);
    }
}
