
//WAP to accept a number n, fill a matrix of size n x n with integers starting at 1, upto n x n
import java.util.*;
class StoreValues
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,mat[][],r,c,i;
        System.out.println("Enter the value for n: ");
        n = sc.nextInt();
        mat=new int[n][n];
        
        i=1;
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                mat[r][c] = i++;
            }
        }
        
        System.out.println("The matrix is: ");
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(mat[r][c] + "\t");
            }
            System.out.println();
        }
        
    }
}

