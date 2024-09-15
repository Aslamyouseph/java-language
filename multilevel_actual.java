import java.util.Scanner;

public class multilevel_actual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the sceond  number : ");
        int num2 = s.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = s.nextInt();
        System.out.println("Enter the fourth numbe : ");
        int num4 = s.nextInt();
        multileve_sub3 m1 = new multileve_sub3();
        int result1 = m1.first_largest(num1, num2);
        int result2 = m1.sceond_largest(result1, num3);
        System.out.println("\n");
        m1.final_largest(result2, num4);
        System.out.println("\n");

    }
}
