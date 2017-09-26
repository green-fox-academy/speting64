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
