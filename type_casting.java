public class type_casting
{
    public static void main(String arg[])
    {
        /*int a=20,result;
        byte b=2;  // this can be done becouse we assing small value to a large value this method is called convertion
        result= a=b;
        System.out.println("The result = " + result);*/

        /*int a=12,result;
        byte b;
        result=b=(byte)a;    //This method is called casting (we convert int into byte then assinging the values )
        System.out.println("The result = " + result); */

        float h=5.6f;   //this time the dicemal pointa are lose
        int result;
        result= (int)h;
        System.out.println("The result = " + result);


    }
}
