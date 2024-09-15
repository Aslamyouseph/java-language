import java.util.Scanner;

interface student {
    int num1 = 10;

    void details(String name);
}

class detailss implements student {

    public void details(String name) {
        System.out.println("i am aslam youseph " + num1 + name);
    }
}

public class interfacee {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        String name = s.nextLine();
        detailss d = new detailss();
        d.details(name);
    }
}
