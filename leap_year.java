import java.util.Scanner;
public class leap_year
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year=s.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("it is a leap leap year : ");
                }
                else
                {
                    System.out.println("it is not a leap year");
                }
            }
            else
            {
                System.out.println("it is a leap year");
            }
        }
        else
        {
            System.out.println("it is not a leap year ");
        }
    }
}