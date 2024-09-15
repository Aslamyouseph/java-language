import java.util.Scanner;

class constructor {
    int num1, num2, num3, add;
    String name1, name2;

    public constructor(String name1, int num1, int num2) {
        this.name1 = name1;
        this.num1 = num2;
        this.num2 = num2;
        add = num1 + num2;
        System.out.println("Name is " + name1 + "\s sum = " + add);
    }

    public constructor(String name2, int num1, int num2, int num3) {
        this.name2 = name2;
        this.num1 = num2;
        this.num2 = num2;
        this.num3 = num3;
        add = num1 + num2 + num3;
        System.out.println("Name is " + name2 + "\s sum = " + add);
    }
}

class constructor_overloding {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        String name1 = s.nextLine();
        System.out.print("Enter the second name : ");
        String name2 = s.nextLine();
        System.out.print("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number : ");
        System.out.println("\n");
        int num3 = s.nextInt();
        constructor c = new constructor(name1, num1, num2);
        constructor cu = new constructor(name2, num1, num2, num3);
    }
}