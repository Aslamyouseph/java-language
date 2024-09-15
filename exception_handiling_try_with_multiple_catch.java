public class exception_handiling_try_with_multiple_catch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int num[] = new int[5];
        String s = null;

        try {
            j = 10 / i;
            System.out.println(num[6]);
            System.out.println(s.length());
        }

        catch (ArithmeticException a) {
            System.out.println("We cannot able to divide with 0 " + a);
        }

        catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Index is out of range " + ar);
        }

        catch (Exception e) {
            System.out.println("some thing went wrong .... " + e);
        }

    }
}
