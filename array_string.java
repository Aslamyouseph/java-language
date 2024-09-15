import java.util.Scanner;
public class array_string 
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int limit=s.nextInt();
        System.out.println("Enter the names for the array : ");
        String name[]=new String[limit];
        int i;
        for(i=0;i<limit;i++)
        {
            name[i]=s.nextLine();
        }
        System.out.println("The name are : \n");
        for(i=0;i<limit;i++)
        {
            System.out.println(name[i]);
        }
    }
}
