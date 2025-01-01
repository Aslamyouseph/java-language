class a {
    public void hello() {
        System.out.println("Hello");
    }
}

class b extends a {
    public void hello() {
        System.out.println("Hi");
    }
}

class zzzz {
    public static void main(String[] args) {
        b B = new b();
        B.hello();
    }
}
