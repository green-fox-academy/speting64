import java.util.ArrayList;

public class Input {

    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList<Person> people = new ArrayList<>();
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student johnTheClone = (Student) john.clone();
        people.add(johnTheClone);

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }
    }
}

