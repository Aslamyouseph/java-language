import java.util.Scanner;

public class menu_card {
   public static void main(String arg[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("\t menu card ");
      System.out.println("\n");
      System.out.println("1 : Biriyanii \n 2 : Manthi \n 3 : Rice \n4 :Fridrice \n5 : Shavarma ");
      System.out.println("Select your choice : ");
      int choice = s.nextInt();
      switch (choice) {
         case 1:
            System.out.println("You select Biriyani   ");
            break;
         case 2:
            System.out.println("You select Manthi   ");
            break;
         case 3:
            System.out.println("You select Rice   ");
            break;
         case 4:
            System.out.println("You select Fridrice   ");
            break;
         case 5:
            System.out.println("You select Shavarma  ");
            break;
         default:
            System.out.println("Ente the correct choice    ");
            break;
      }

   }
}