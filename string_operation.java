import java.util.Scanner;

public class string_operation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of the studnet : ");
        String name = s.nextLine();
        System.out.println("\n");
        System.out.println("Length of the string is " + name.length()); // this is used to find the lendth of the string
        System.out.println("\n");

        StringBuffer sb = new StringBuffer();// Maximum cappasity of string buffer is 16 charecters
        sb.append(" Youseph");// append section (for joing two String )
        System.out.println("After appanding the two string is : " + name + sb);
        System.out.println("\n");

        // Before the 15 line we want to add then 11 line
        sb.deleteCharAt(2);
        System.out.println("After deleting the letter " + name + sb);// used to delete a specific letter from string
        System.out.println("\n");

        // Before the 22 line we want to add then 11 line
        sb.delete(2, 4);
        System.out.println("After deletion number of letter " + name + sb);// to delete number of letter from string
        System.out.println("\n");

        // Before the 27 line we want to add then 11 line
        sb.reverse();
        System.out.println("Reversing the string is " + name + sb); // used to rever the string
        System.out.println("\n");

        // Before the 33 line we want to add then 11 line
        sb.insert(0, " java ");
        System.out.println("inserting new string to the existing string " + name + sb);
        System.out.println("\n");

        // Before the 33 line we want to add then 11 line
        sb.replace(5, 9, "java");
        System.out.println(name + sb);
        System.out.println("\n");

    }
}
// there are varios kind of operation in string s look in google / youtube