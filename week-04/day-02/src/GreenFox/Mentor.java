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
