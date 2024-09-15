public class logical_operator
{
    public static void main(String arg[])
{
    int a=10;
    int b=20;
    int x=5;
    int y=2;
    boolean result;
    result=a>b && x<y;  //and operator 
    System.out.println(result);
    System.out.println(a>b || x<y); //or operator  
    System.out.println(a<b || x<y);
    System.out.println(a>b || x>y);
    System.out.println(!result);  //it is opposit in the line of 11 (opposite of the 11 operation ) becouse ! operator is used in the result section
}
    
}
