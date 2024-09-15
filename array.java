import java.util.Scanner;
public class array
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int limit=s.nextInt();
        int i;
        System.out.println("Enter the array elements : ");
        int num[]=new int[limit]; // syntax of array (creating new array ) 
        for(i=0;i<limit;i++)
        {
           num[i]=s.nextInt();  //inserting methods  
        }
        System.out.println("The array elemnts are : \n");
        for(i=0;i<limit;i++)
        {
            System.out.println(num[i]);   // important section (check the display of the array )
        }
    }    
}
