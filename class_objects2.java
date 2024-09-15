import java.util.Scanner;
class family
{
    public int family_income(int x)
    {
        int final_income;
        final_income=x+1000;
        return(final_income);
    }
}
public class class_objects2
{
    public static void main(String str[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name the son : ");
        String name1=s.nextLine();
        System.out.println("Enter the father name : ");
        String name2=s.nextLine();
        System.out.println("Enter the mother name : ");
        String name3=s.nextLine();
        System.out.println("Enter the sister name : ");
        String name4=s.nextLine();
        System.out.println("Enter the prvious year family income");
        int income=s.nextInt();

        family inc=new family();
        {
            int result;
            System.out.println("Name of the son is " +name1);
            System.out.println("Name of the father is " +name2);
            System.out.println("Name of the mother is "+name3);
            System.out.println("Name of the sister is " +name4);

            result=inc.family_income(income);
            System.out.println("The annual income of the family is " + result);
        }
    }
}