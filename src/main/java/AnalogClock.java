import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int currentHourDegrees = scanner.nextInt();
        int hourHandDegrees = 2;
        int minuteHandDegrees = 6;
        int degreesPerHour;
        int minutesPast;
        int currentMinuteDegrees;

        /*
         *  your code goes here
         */
          degreesPerHour = currentHourDegrees % 30;
          minutesPast = degreesPerHour * hourHandDegrees;
          currentMinuteDegrees = minutesPast * minuteHandDegrees;

          System.out.println(currentMinuteDegrees);
        // closing the scanner object
        scanner.close();
    }
}