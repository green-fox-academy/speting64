import java.util.ArrayList;
import java.util.List;

public class PallidaClass {

    String className;
    List<Student> students = new ArrayList<Student>();
    List<Mentor> mentors = new ArrayList<Mentor>();

    public PallidaClass (String className){

        this.className = className;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public PallidaClass(){
        String className = "Lagopus";
    }

    public void addStudent(Student Student){
        this.students.add(Student);
    }
    public void addMentor(Mentor Mentor){
        this.mentors.add(Mentor);
    }

    public void info(){

        System.out.println("Lagopus "+ className + " class has " + students.size() + " students and " + mentors.size() + "mentors " );
    }
}

