import java.util.Scanner;
public class for_loop_another 
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array values : ");
        int num[]=new int[5];
        int i;
        for(i=0;i<num.length;i++)
        {
            num[i]=s.nextInt();
        }
        System.out.println("Array values are : ");
        for(i=0;i<num.length;i++)
        {
            System.out.print(num[i]);
        }

    }

}
