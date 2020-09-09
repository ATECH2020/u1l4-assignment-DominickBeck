import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();

        /*
         *  your code goes here
         */
          int desksNeeded = 0;

          if(classA % 2 == 1)
          {
            desksNeeded += (classA / 2) + 1;
          }
          else
          {
            desksNeeded += classA / 2;
          }

          if(classB % 2 == 1)
          {
            desksNeeded += (classB / 2) + 1;
          }
          else
          {
            desksNeeded += classB / 2;
          }

          if (classC % 2 == 1)
          {
            desksNeeded += (classC / 2) + 1;
          }
          else
          {
            desksNeeded += classC / 2;
          }

          System.out.print(desksNeeded);
        // closing the scanner object
        scanner.close();
    }
}