import java.util.Scanner;
public class input_2 
{
    public static void main(String arg[])
    {
        System.out.println("\t Bio data input ........\n");
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the name :  ");
        String name1=s.nextLine();                          //string storingnn
        System.out.println("Enter the name of the father : ");
        String name2=s.nextLine();
        System.out.println("Enter the name of the of the mother : ");
        String name3=s.nextLine();
        System.out.println("Ente the name of the sister : ");
        String name4=s.nextLine();
        System.out.println("Enter the age of the father : ");
        int age1=s.nextInt();                                      //integer storing 
        System.out.println("Enter the age of the mother ");
        int age2 =s.nextInt();
        System.out.println("Enetr the age  of the sister : ");
        int age3 =s.nextInt();
        System.out.println("\tBio data output .....\n");
        System.out.println("\nMy name is \s" + name1);
        System.out.println("\nMy father name is \s"+ name2);
        System.out.println("\nMy mother name is\s " +name3);
        System.out.println("\nMy sister name is \s" + name4);
        System.out.println("\nMy father age is \s"+ age1);
        System.out.println("\nMy mother age is \s"+age2);
        System.out.println("\nMy sister age is \s"+age3);
        
    }
    
}
