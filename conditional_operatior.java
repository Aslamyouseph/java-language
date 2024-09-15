public class conditional_operatior
{
    public static void main(String arg[])
    {
        int a=10,b;  //we initilaisae the value of a ==10
        b=(a==4)? 8 :5;  //in here when value of a!=10 , then b take the value 3  
        System.out.println(b);
        b=(a==10) ? 3:7;  //in here the value of a==10,so the b take 7 
        System.out.println(b);

        // if the condition satisfy the the b is take the first value ,
        // if tyhe condition is not satisfy the b take the second value 
    }
}
