import java.util.Scanner;

class student {
    private String name; // this is delecar as the privet data
    private int rno; // it can be only abe to acces by using a method under the same class .

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

}

public class privet_data_encapsulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name of the studnet : ");
        String name = s.nextLine();
        System.out.println("enter the roll number of the studet : ");
        int rno = s.nextInt();

        student stu = new student();
        stu.setName(name); // passing the data as parameter
        stu.setRno(rno);// passing the data as parameter
        System.out.println("\n");
        System.out.print(stu.getName() + " : " + stu.getRno()); // nested member funtion is called
        System.out.println("\n");

    }
}