import java.util.Scanner;
public class do_while
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value for the condition : ");
        int i=s.nextInt();
        do
        {
            System.out.println("Hello Aslam ");  //one time is print (becose conditiom is wrong )
            i++;
        }while(i==5);   //condition is wrong 
    }
}

// this is mainly used for the situation in which the condition is wrong but we want to execute the statement one a time
// in the above example the condition is wrong but it is ececute one time 
// but in while loop and for loop one the execution is happend when the condition is true  