
import java.util.*;
class Largest2
{
    int a,b,l;
    Largest2()
    {
        a=b=l=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void compute()
    {
        l = a;
        if(b>l)
            l=b;
       
    }
    void display()
    {
        System.out.println("Largest is: " + l);
    }
}