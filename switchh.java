import java.util.Scanner;
public class switchh
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=s.nextInt();
        switch (num) 
        {
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday ");
                break;
            case 3:
                System.out.println("Wenesday");
                break;
            case 4:
                System.out.println("Thrusday ");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
                System.out.println("Saturday ");
                break;
            case 7:
               System.out.println("Sunday");
               break;     
            default:
                System.out.println("Ente the correct value ");
                break;
        }

        
    }
}