import java.util.Scanner;
import mypack.*;

public class packageOFAddition {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = s.nextInt();

        additionOperation result = new additionOperation();
        int resultOfAddition = result.add(num1, num2);
        int resultOfSubtraction = result.subtract();

        System.out.println("Sum of two number is " + resultOfAddition);
        System.out.println("Difference of two number is " + resultOfSubtraction);

    }

}