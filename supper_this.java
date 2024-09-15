class A {// constructor
    public A() {
        System.out.println("We are in A defult constructor : ");
    }

    public A(int c) {
        super();
        System.out.println("We are in the parametrize constructor of A : ");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("We are in B defult constructor : ");
    }

    public B(int c) {
        this();
        System.out.println("We are in the parametrize constructor of B : ");
    }
}

public class supper_this {
    public static void main(String[] args) {
        B b = new B();
    }
}
