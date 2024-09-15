import java.util.Scanner;
public class sorting
{
     public static void main(String arg[])
    {
        int k;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=s.nextInt();
        System.out.println("Enter the seond number : ");
        int num2=s.nextInt();
        System.out.println("Before sorting num1 = " +num1 );
        System.out.println("Before sorting num2 = " +num2 );
        
        k=num1;
        num1=num2;
        num2=k;
        System.out.println("After sorting num1 =" + num1);
        System.out.println("Before sorting num2 = " +num2 );

    }
}
