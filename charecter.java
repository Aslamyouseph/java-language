import java.util.Scanner;
public class charecter 
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the charecter : ");
        char ch=s.next().charAt(0);   //In here we take the charecter by giving the index (we and location) 
        System.out.println("The charecter is : " + ch);

    }
}
