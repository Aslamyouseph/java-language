import java.util.Scanner;
class largestNumber
{
    public int largest(int x,int y)  //conside the number of the argumnet which is passing from below 
    {
        return x+y;
    }
    public int largest(int x,int y,int z)    //conside the number of the argumnet  which is passing from below 
    {
        return x+y+z;
    }
}
public class method_overloading
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=s.nextInt();
        System.out.println("Enter the  second number : ");
        int num2=s.nextInt();
        System.out.println("Enter  the third number : ");
        int num3=s.nextInt();

        largestNumber lar=new largestNumber();
        int r1,r2;
        r1=lar.largest(num1,num2);   // same funtion name (considare only the number of arguments passing which have the proper resiving section neede )
        r2=lar.largest(num1,num2,num3); // same funtion name (considare only the number of arguments passing which have the proper resiving section neede )
        System.out.println("The sum of the two numbers is " +r1);
        System.out.println("The sum of the three number is " +r2 );
    }   
}
