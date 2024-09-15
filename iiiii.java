class A {
    public int add(int a, int b) {
        System.out.println("We are in A class ");
        return (a + b);
    }
}

class b extends A {
    public int add(int a, int b) { // same funtion name and parameter so it does not print the code inside the A
                                   // class (b class code is overridden the A class code )
        System.out.println("WE are in b class ");
        return (a + b) + 1;
    }
}

public class iiiii {
    public static void main(String[] args) {
        b B = new b(); // it fisrt check the b class if the add funtion is in b class the it exectde it
                       // ,if the add funtion is not in the b class then move to the A class
        int r1 = B.add(3, 5);
        System.out.println("sum = " + r1);
    }

}
