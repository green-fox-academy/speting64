public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int sem = 17;
        int avhour = 6;
        int weekday = 5;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int sum = sem*avhour*weekday;
        System.out.println("The average coding hour is: " + sum);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int wh = 52;
        float perc =(wh*100)/sum;

        System.out.println("The percentage of coding hours is: " + perc + "%");
    }
}
