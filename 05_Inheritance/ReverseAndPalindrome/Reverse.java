
import java.util.*;
class Reverse
{
    int n,r;
    Reverse()
    {
        n= r = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
    }
    void compute()
    {
        int div,digit;
        for(div=n;div>0;div=div/10)
        {
            digit = div%10;
            r = r*10+digit;
        }
    }
    void display()
    {
        System.out.println("Reverse is: " + r);
    }
}