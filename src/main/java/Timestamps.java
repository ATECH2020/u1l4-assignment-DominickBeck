import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secInHour1;
        int secInHour2;

        /*
         *  your code goes here
         */
          int secInHour1 = hours * 3600;
          int secInHour2 = hours * 3600;
          int secInMin1 = minutes1 * 60;
          int secInMin2 = minutes2 * 60;

          int deltaHour = secInHour2 - secInHour1;
          int deltaMin = secInMin2 - secInMin1;
          int deltaSec = secounds2 - secounds1;
          
          int totalSec = delatHour + deltaMin + deltaSec;
        // closing the scanner object
        scanner.close();
    }
}