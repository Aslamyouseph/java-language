import java.util.Scanner;
public class array_values_adding
{
    
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int limit=s.nextInt();
        System.out.println("Enter the array values : ");
        int num[]=new int[limit];
        int i;
        for(i=0;i<limit;i++)
        {
            num[i]=s.nextInt();
        }
        System.out.println("The sum of the elemnets in the arry is : ");
        int sum=0;
        for(i=0;i<limit;i++)
        {
            sum=sum+num[i];  //which is used to add the  value of the array when value is incrementing by 1
        }
        System.out.println(sum);
    }
}
