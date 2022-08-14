
import java.util.*;
class Sum
{
    int a,b,s;
    Sum()
    {
        a =b = s= 0;
        
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void computeSum()
    {
        s = a+b;
    }
    void displaySum()
    {
        System.out.println("Sum is: " + s);
    }
}