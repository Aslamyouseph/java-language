import java.util.Scanner;

class information {
    public void stud_getdata() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of the student : ");
        String name = s.nextLine();
        System.out.print("Enter the roll number of the student : ");
        int rno = s.nextInt();
        System.out.print("Enter the mark of the first subject : ");
        int m1 = s.nextInt();
        System.out.print("Enter the mark of the second subject : ");
        int m2 = s.nextInt();
        System.out.print("Enter the mark of the third subject : ");
        int m3 = s.nextInt();
        int total;
        float pesrsentage;
        total = m1 + m2 + m3;
        pesrsentage = (total * 100) / 300;
        System.out.println("\n");
        System.out.println("Name of the student is " + name);
        System.out.println("Roll number of the student is " + rno);
        System.out.println("Mark of the first subject is " + m1);
        System.out.println("Mark of the second subject is " + m2);
        System.out.println("Mark of the third subject is " + m3);
        System.out.println("Total mark is " + total);
        System.out.println("Persentage of the mark is : " + pesrsentage);
        System.out.println("\n");
    }
}

public class array_of_objects {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int limit = s.nextInt();
        System.out.println("\n");
        information f = new information();
        for (int i = 0; i < limit; i++) {
            f.stud_getdata();
        }
    }
}
