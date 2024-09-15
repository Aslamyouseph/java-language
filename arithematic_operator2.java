import java.util.Scanner;
public class arithematic_operator2
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Ente the first nnumber : ");
        int num1=s.nextInt();
        System.out.println("Ente the second number : ");
        int num2=s.nextInt();
        int sub=num1-num2;
        int add=num1+num2;
        System.out.println(  num1 + "\s+\s"  + num2  + "\s=\s" + add);
        System.out.println(  num1 + "\s-\s"  + num2  + "\s=\s" + sub);
        System.out.println(  num1 + "\s*\s"  + num2  + "\s=\s" + num1*num2);
        System.out.println(  num1 + "\s/\s"  + num2  + "\s=\s" + num1/num2);
        System.out.println(  num1 + "\s%\s"  + num2  + "\s=\s" + num1%num2);
    }
}
