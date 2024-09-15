import java.util.Scanner;

public class single_inheritance_actual {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = s.nextInt();

        single_inheritance_sub2 s1 = new single_inheritance_sub2();
        int r1 = s1.add(num1, num2);
        int r2 = s1.sub(num1, num2);
        int r3 = s1.mul(num1, num2);
        int r4 = s1.div(num1, num2);

        System.out.println("\n");
        System.out.println("Additing of two number are " + r1);
        System.out.println("subtracting  of two number are " + r2);
        System.out.println("multipication of two number are " + r3);
        System.out.println("division of two number are " + r4);

    }
}
