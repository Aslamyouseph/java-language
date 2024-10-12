class A implements Runnable {
    public void run() {
        System.out.println("We are in A implements");
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello Aslam youseph");
        }
    }
}

class B implements Runnable {
    public void run() {
        System.out.println("We are in B implements ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("And i am from Nellimattom");
        }
    }
}

public class multithrading_using_interfaces {
    public static void main(String arg[]) {

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}