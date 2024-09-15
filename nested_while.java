import java.util.Scanner;
public class nested_while
{
    public static void main(String str[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Ente the value for i : ");
        int i=s.nextInt();
        //System.out.println("Enter the value for j : ");
        //int j=s.nextInt();
        while(i<=5)
        {
            System.out.println("Hello aslam" );
            int j=1;  // automatically assume tha value of  j =1 when  the inner loop is one time complete its execution
            while(j<=3)
            {
                System.out.println("Hi aslam");
                j++;
            }
            i++;
        }
    }
}
