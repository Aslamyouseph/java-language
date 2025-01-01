import java.util.Scanner;

public class primeOrNor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flage = 0;
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flage = 1;
                break;
            }
        }
        if (flage == 0) {
            System.out.println("Its a prime number ");
        } else {
            System.out.println("its not a prime number");
        }
    }
}
