
import java.util.*;
class Largest3 extends Largest2
{
    int c;
    Largest3()
    {
        c=0;
    }
    void input5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
    }
    void compute()
    {
        l = a;
        if (b>l)
            l=b;
        if (c>l)
            l=c;
    }
}