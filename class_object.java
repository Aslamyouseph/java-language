import java.util.Scanner;
class addition   //classs defenition 
{
    public int add(int x,int y)   //accesing the parameter which is passed by the object(int is given to specify the return type S)  
    {
        int r;
        r=x+y;
        return (r);   //returning the result  
    }
}
public class class_object    //compailation is starting from here  
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Ente the first number : ");
        int num1=s.nextInt();
        System.out.println("Ente the second number  : ");
        int num2=s.nextInt();
        
        addition a=new addition();  //crearting and  object for the class 
        int result;
        result=a.add(num1,num2);  //calling the class (result is used to store the value )
        System.out.println("The sum of the two number are : " + result);

    }
}
