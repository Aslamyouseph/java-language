import java.util.Scanner;
public class student_grade
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        String name=s.nextLine();
        System.out.println("Enter then roll  number of the student : ");
        int rno=s.nextInt();
        System.out.println("Ente the Physics mark : ");
        int m1=s.nextInt();
        System.out.println("Ente the mark of the chemistry : ");
        int m2=s.nextInt();
        System.out.println("Ente the mark of the maths  : ");
        int m3=s.nextInt();
        int total=s.nextInt();
        total=m1+m2+m3;
        System.out.println("Your total is "+total);
        int per=s.nextInt();
        per=total/300;
        System.out.println("your persentage is " +per);
        switch (per)
         {
            case 1: 
                System.out.println("A+");
                break;
            case 2: 
                System.out.println("A");
                break;
            case 3: 
                System.out.println("B+");
                break;
            case 4: 
                System.out.println("B");
                break;
            case 5: 
                System.out.println("C+");
                break;
            case 6: 
                System.out.println("C");
                break;
            default:
                System.out.println("You lose");
                break;
        }

    }   
}
