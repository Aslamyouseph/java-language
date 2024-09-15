class AslamException extends Exception {
    public AslamException(String s) {
        super(s);
    }
}

public class exection_handiling_customer {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 15 / i;
            if (j == 0) {
                throw new AslamException("double check it ");
            }
        } catch (AslamException as) {
            System.out.println("some thing went worng ..." + as);
        }
        System.out.println("ok");
    }

}
