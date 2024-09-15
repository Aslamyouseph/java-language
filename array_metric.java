import java.util.Scanner;

public class array_metric
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array row : ");
        int r1=s.nextInt();
        System.out.println("Enter the array coloum : ");
        int c1=s.nextInt();
        System.out.println("Enter the array  elements : ");
        int num1[][]=new int[r1][c1];
        int i,j;
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                num1[i][j]=s.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("The metrix is : \n");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(num1[i][j] +"\t");  //println is not used (Becose if we use println thin it always printbin next line)
            }                                      //if print is only use the it print in the same line 
        System.out.println("\n");
        }
        
    }
}
