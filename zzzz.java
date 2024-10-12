import java.util.Scanner;

class operations {
    public void result(int num1, int num2) {
        try {
            int num3 = num1 / num2;
            System.out.println("Result = " + num3);
        } catch (Exception error) {
            System.out.println("it's not possible to divided");

        } finally {
            System.out.println("Have a nice day!");
        }

    }
}

public class zzzz {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = s.nextInt();
        operations op = new operations();
        op.result(num1, num2);

    }
}