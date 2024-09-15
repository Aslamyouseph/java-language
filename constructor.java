import java.util.Scanner;

class student {
    int rno;
    String name;

    public student() {// same name as the class name (also no need to specify the void or int in here
                      // )
        System.out.println("\n");
        rno = 23; // defult constructor
        name = "Aslam";
        System.out.println("We are in defult constructor : ");
        System.out.println(name + " : " + rno);
        System.out.println("\n");
    }

    public student(String name, int rno) {// same name as the class name
        this.rno = rno; // parametrized constructor
        this.name = name;
        System.out.println("we are in parametrized constructor : ");
        System.out.println(name + " : " + rno);

    }

}

public class constructor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        student stu1 = new student();
        System.out.println("Enter the name of the sceond student ; ");
        String name2 = s.nextLine();
        System.out.println("Enter the roll  number of the second student : ");
        int rno2 = s.nextInt();
        student stu2 = new student(name2, rno2);
    }
}
