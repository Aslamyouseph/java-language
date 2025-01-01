import java.util.Scanner;
import mypack.*;

class packageSubtraction {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number ");
        int num2 = s.nextInt();

        subtractionOperation so = new subtractionOperation();
        int result = so.subtraction(num1, num2);

        System.out.println("Result = " + result);
    }
}