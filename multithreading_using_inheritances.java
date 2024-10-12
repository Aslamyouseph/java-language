class A extends Thread {
    public void run() {
        System.out.println("Its our Thread A class");
        for (int i = 0; i < 10; i++) {
            System.out.println("We are in the A class loop");
        }
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Its our Threads B class");
        for (int i = 1; i <= 10; i++) {
            System.out.println("We are in the B class loop");
        }
    }
}

public class multithreading_using_inheritances {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }

}
