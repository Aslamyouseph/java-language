import java.util.Scanner;

public class excaption_handiling_try_carch_ {

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = s.nextInt();
        int j = 0;

        // case 1
        // try {
        // j = num1 + num2;
        // } catch (Exception e) {
        // System.out.println("some thing went worng .." + e);
        // }

        // case 2
        try {
            j = num1 / 0;
        } catch (Exception e) {
            System.out.println("some thing went worng .." + e);
        }

        System.out.println("The value of j = " + j);

    }
}