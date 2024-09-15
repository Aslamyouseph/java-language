import java .util.Scanner;
public class arithematic_operation
{
    public static void main(String arg[])
    {
        int addition,subtraction,divition,multiplication,modulas;
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter the first number :");
        int num1=s.nextInt();
        System.out.println("\nEnter the second number : ");
        int num2=s.nextInt();
        addition=num1+num2;
        subtraction=num1-num2;
        multiplication=num1*num2;
        divition=num1/num2;
        modulas=num1%num2;
        System.out.println("\nAddition of two numbeers : \s" + addition );
        System.out.println("\nSubtraction of two numbers : \s" +subtraction );
        System.out.println("\nMultiplivation of two numbers is : \s"+multiplication );
        System.out.println("\nDivition of two numbers is : \s"+divition );
        System.out.println("\nModulas of two numbers is : \s" +modulas );
        

    }
    
}
