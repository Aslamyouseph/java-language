import java.util.Scanner;

class largestOne
{
    public int largest(int x,int y)
    {
        if (x>y)
        {
            return (x);
        }
        else
        {
            return (y);   
        }
        
    }
}
public class class_object2 
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=s.nextInt();
        System.out.println("Enter  the second number : ");
        int num2=s.nextInt();
        System.out.println("Enter the third number : ");
        int num3=s.nextInt();

        largestOne lar=new largestOne();
        int result;
        result=lar.largest(num1,num2);
        System.out.println("The result is : " + (result + num3));
    }    
}
