import java.util.Scanner;

class family {
    public void members(String a, String b, String c, String d) {
        String name1 = a;
        String name2 = b;
        String name3 = c;
        String name4 = d;
        System.out.print("Name of the student is " + name1);
        System.out.println("\n");
        System.out.print("Name of the father is  " + name2);
        System.out.println("\n");
        System.out.print("Name of the mother is  " + name3);
        System.out.println("\n");
        System.out.print("Name of the sister is  " + name4);
        System.out.println("\n");
        System.out.println("\n");
    }

    public void mak(int x, int y, int z) {
        x = x;
        y = y;
        z = z;
        int total = x + y + z;
        float per = (total / 300) * 100;
        System.out.print("The total mark is " + total);
        System.out.println("\n");
        System.out.print("The persentage of the mark is " + per);
    }
}

public class classs_object3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of the student : ");
        String name1 = s.nextLine();
        System.out.print("Enter the father name  : ");
        String name2 = s.nextLine();
        System.out.print("Enter the mother name  : ");
        String name3 = s.nextLine();
        System.out.print("Enter the sister name : ");
        String name4 = s.nextLine();
        System.out.print("Enter the mark of the maths  : ");
        int m1 = s.nextInt();
        System.out.print("Enter the mark of the chemistry : ");
        int m2 = s.nextInt();
        System.out.print("Enter the mark of the third subject : ");
        int m3 = s.nextInt();

        family f = new family();
        f.members(name1, name2, name3, name4);
        f.mak(m1, m2, m3);

    }
}
