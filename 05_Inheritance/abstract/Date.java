
import java.util.*;
abstract class Date
{
    int dd,mm,yy;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        dd = sc.nextInt();
        mm = sc.nextInt();
        yy = sc.nextInt();
    }
    abstract void display();
}