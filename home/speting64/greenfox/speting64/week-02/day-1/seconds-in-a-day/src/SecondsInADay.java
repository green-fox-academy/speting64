public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondSum = (currentHours*3600)+(currentMinutes*60)+currentSeconds;

        int daySeconds = 86400; // 60seconds * 60 minutes * 24 hours
        int remainder = daySeconds - secondSum;

        System.out.println (remainder);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables
    }
}
