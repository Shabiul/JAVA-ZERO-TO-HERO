
//WAP to accept a decimal number and convert to binary/octal
import java.util.*;
class DeciToBin2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,div;
        int bin[]=new int[50],i;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        
        i=0;
        for(div=n;div>0;div/=2)
        {
            bin[i++] = div%2;
        }
        
        System.out.println("The binary equivalent is: ");
        for(i--;i>=0;i--)
            System.out.print(bin[i]);
    }
}