import java.util.Scanner;

public class for_loop_enchance {

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int limit = s.nextInt();
        int i;
        System.out.println("Enter the array elements : ");
        int num[] = new int[limit]; // syntax of array (creating new array )
        for (i = 0; i < limit; i++) {
            num[i] = s.nextInt(); // inserting methods
        }
        System.out.println("The array elemnts are : \n");
        for (int n : num) // it is called enhnace for loop (becose it does not need the initial values and
                          // limit )
        { // in here the value of the array is assinged to "n" it condinue the assingning
          // till the last index
            System.out.println(n); // important section (check the display section becose in here we print only the
                                   // value of "n" )
        }
    }
} // Enhanced for loop mainly work in array section
