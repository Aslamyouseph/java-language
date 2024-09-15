import java.util.Scanner;

public class jagged_array 
{
    
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array row : ");
        int r1=s.nextInt();
        System.out.println("Enter the number of elements on first row ");
        int a=s.nextInt();
        System.out.println("Enter the number of the elements in second row   : ");
        int b=s.nextInt();
        System.out.println("Ente the number of the elemnts  in the third row :  ");
        int c=s.nextInt();
        System.out.println("Enter the array  elements : ");
        int num1[][]=new int[r1][];
        num1[0]=new int[a];
        num1[1]=new int[b];
        num1[2]=new int[c];
        int i,j;
        for(i=0;i<num1.length;i++)
        {
            for(j=0;j<num1[i].length;j++)
            {
                num1[i][j]=s.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("The metrix is : \n");
        for(i=0;i<num1.length;i++)
        {
            for(j=0;j<num1[i].length;j++)
            {
                System.out.print(num1[i][j] +"\t");  //println is not used (Becose if we use println thin it always printbin next line)
            }                                      //if print is only use the it print in the same line 
        System.out.println("\n");
        }
        
    }
}
