import java.util.Scanner;    //to input aything e want to inport this file 

public class input
{
    public static void main(String arg[])
    {
        System.out.println("The output ststement  ");
        Scanner s = new Scanner(System.in);    //this is the import syntax  
        System.out.println("Ente the number :  ");
        int num= s.nextInt();   //use to store the input file 
        System.out.println("The number is " + num);


    }
}
