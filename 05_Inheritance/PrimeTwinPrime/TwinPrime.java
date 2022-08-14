
import java.util.*;
class TwinPrime extends Prime
{
    int a,b;
    TwinPrime()
    {
        a = b= 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    boolean areTwinPrime()
    {
        
        if(Math.abs(a-b)!=2)
            return false;
        n = a;
        if(isPrime())
        {
            n = b;
            if(isPrime())
            {
                return true;
            }
        }
        return false;
    }
}