public class Bmi {
    public static void main(String[] args) {
        double massInKg = 88.2;
        double heightInM = 1.88;

        double bmi = ((massInKg)/(heightInM*heightInM));
        // Print the Body mass index (BMI) based on these values
        System.out.println("Your BMI is:" + bmi);


    }
}
