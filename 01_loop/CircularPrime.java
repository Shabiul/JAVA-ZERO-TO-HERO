
//WAP to accept a number and check circular prime or not.

import java.util.*;
class CircularPrime
{
    private int n;
    public CircularPrime()
    {
        n = 0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
    }
    private boolean isPrime(int n)
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void check()
    {
        int x;
        boolean prime=true;
        String s;
        x=n;
        do
        {
            if(!isPrime(x))
            {
                prime=false;
                break;
            }
            
            s = ""+x;
            s = s.substring(1) + s.charAt(0);
            x = Integer.parseInt(s);
            
        }while(x!=n);
        
        if(prime)
            System.out.println(n + " IS A CIRCULAR PRIME");
        else
            System.out.println(n + " IS NOT A CIRCULAR PRIME");
        
        
    }
    public static void main(String args[])
    {
        CircularPrime ob = new CircularPrime();
        ob.input();
        ob.check();
    }
}