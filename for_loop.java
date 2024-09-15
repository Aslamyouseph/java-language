import java.util.Scanner;
public class for_loop
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of working days :  ");
        int n=s.nextInt();
        System.out.println("Enter  the starting timeof a working day :");
        int h=s.nextInt();
        System.out.println("Enter the ending time of a working day  (in standard way)");
        int st=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++)   // main for loop section 
        {
            System.out.println("Day" + i);
            for(j=h;j<=st;j++)      //nested for loop section 
            {
                System.out.println(j + "-" + (j+1) +  ":" );
            }
            System.out.println("\n");
        }
    }
}
