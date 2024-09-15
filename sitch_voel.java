import java.util.Scanner;
public class sitch_voel
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the charecter : " );
        char c = s.next().charAt(0);
        switch (c) 
        {
            case 'a':
                System.out.println("It ia a vowel letter : ");
                break;
            case  'e':
                System.out.println("It is vowel letter : ");
                break;
            case 'i':
                System.out.println("It ia a vowel letter : ");
                break;
            case  'o':
                System.out.println("It ia a vowel letter : ");
                break;
            case 'u':
                System.out.println("It ia a vowel letter : ");
                break;
            case 'A':
                System.out.println("It ia a vowel letter : ");
                break;
            case  'E':
                System.out.println("It is vowel letter : ");
                break;
            case 'I':
                System.out.println("It ia a vowel letter : ");
                break;
            case  'O':
                System.out.println("It ia a vowel letter : ");
                break;
            case 'U':
                System.out.println("It ia a vowel letter : ");
                break;
            default:
                System.out.println("It is not an vowel letter : ");
                break;
        }

    }
}