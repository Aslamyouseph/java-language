import java.util.Scanner;
public class if_else_if
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=s.nextInt();
        System.out.println("Enter the second number : ");
        int num2=s.nextInt();
        System.out.println("Enter the third number : ");
        int num3=s.nextInt();
        
        if (num1>num2 && num1>num3)
        {
            System.out.println("First one is the largest : " +num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("The second one is the largest : "+num2);
        }
        else
        {
            System.out.println("The third one is the largest one : "+num3);
        }
    

    }
}