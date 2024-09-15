class a { // outer class
    int age;

    public void show() {
        System.out.println("We are in show ()");
    }

    class b { // inner class
        int rno;

        public void info() {
            System.out.println("We are in info ()");
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        a av1 = new a();// outer class
        av1.show();
        a.b av2 = av1.new b();// inner class(to create the object for inner class we need the object of outer
                              // class ,[a.b] means b extents a )
        av2.info();
    }
}