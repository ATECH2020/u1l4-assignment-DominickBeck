import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int numInClass1 = scanner.nextInt();
        int numInClass2 = scanner.nextInt();
        int numInClass3 = scanner.nextInt();

        /*
         *  your code goes here
         */
          int desksNeeded = 0;

          if(numInClass1 % 2 == 1)
          {
            desksNeeded += (numInClass1 / 2) + 1;
          }
          else
          {
            desksNeeded += numInClass1 / 2;
          }

          if(numInClass2 % 2 == 1)
          {
            desksNeeded += (numInClass2 / 2) + 1;
          }
          else
          {
            desksNeeded += numInClass2 / 2;
          }

          if (numInClass3 % 2 == 1)
          {
            desksNeeded += (numInClass3 % 2) + 1;
          }
          else
          {
            desksNeeded += numInClass3 / 2;
          }

          System.out.print("The amount of desks needed is " + desksNeeded);
        // closing the scanner object
        scanner.close();
    }
}