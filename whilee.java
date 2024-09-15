import java.util.Scanner;
public class whilee
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of the countition : ");  //here the  break point is give 
        int num1=s.nextInt();
        while (num1<=5)
        {
            System.out.println("Hi aslam " + num1);
            num1++;
        }
        System.out.println("Bye " + num1);  
    }
}