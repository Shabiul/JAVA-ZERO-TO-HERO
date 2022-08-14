
import java.util.*;
class LargestNew extends Largest2
{
    int c;
    LargestNew()
    {
        c=0;
    }
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
    }
    void compute()
    {
        super.compute();
        if (c>l)
            l=c;
    }
}