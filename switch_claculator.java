import java.util.Scanner;
public class switch_claculator
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=s.nextInt();
        System.out.println("Enter the second number : ");
        int num2=s.nextInt();
        System.out.println(" 1 : addition \n 2 : subtraction \n 3 : mutliplication \n 4 : divition \n 5 : modulas ");
        int choice =s.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("You choose addition : " + num1+num2);
                break;
            case 2:
                System.out.println("You choose subtraction : " + (num1-num2));
                break;
            case 3:
                System.out.println("You choose multilpication : " + num1*num2);
                break;
            case 4:
                System.out.println("You choose divition: " + num1/num2);
                break;
            case 5:
                System.out.println("You choose modulas : " + num1%num2);
                break;
            default:
                System.out.println("Invalid entry   ");
                break;
        }
    }
}
