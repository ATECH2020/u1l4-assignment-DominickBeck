import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();
        int hours;
        int min;

        //Your code goes here
        hours = number / 3600;
        min = number / 60;
        System.out.println(hours + "  " + min);

        
        // closing the scanner object
        scanner.close();
    }
}