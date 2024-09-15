import java.util.Scanner ;
public class iff_elsee
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Ente the numebr : ");;
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("It is an even number ");
        }
        else
        {
            System.out.println("It is an odd number ");
        }
    }   
}
