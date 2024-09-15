import java.util.Scanner;
public class array_searching
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int limit=s.nextInt();
        System.out.println("Enter the array values : ");
        int num[]=new int[limit];
        int i,flage=0;
        for(i=0;i<limit;i++)
        {
            num[i]=s.nextInt();
        }
        System.out.println("Enter the search kery : ");
        int search=s.nextInt();
        for(i=0;i<limit;i++)
        {
            if(search==num[i])
            {
                flage=1;
                break;
            }
        }
        if(flage==1)
        {
            System.out.println("The search element is founded in  " +(i+1 )+ "  possition ");
        }
        else
        {
            System.out.println("The search element is not founded ");
        }
    }
}    