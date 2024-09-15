public class execption_handding_throw_keyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try

        {
            j = 15 / i;
            if (j == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException a) {
            System.out.println("Some thing went worng  " + a);
        }
        System.out.println("Value of j =" + j);
    }

}
