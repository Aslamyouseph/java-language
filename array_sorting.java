import java.util.Scanner;

public class array_sorting
{
    
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int limit=s.nextInt();
        System.out.println("Enter the array values : ");
        int num[]=new int[limit];
        int i,j,temp=0;
        for(i=0;i<limit;i++)
        {
            num[i]=s.nextInt();
        }
        for(i=0;i<limit-1;i++)
        {
            for(j=i+1;j<limit;j++)
            {
                if(num[i]>num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("The sorted arry is : \n");
        for(i=0;i<limit;i++)
        {
            System.out.println(num[i]);
        }

    }
}
