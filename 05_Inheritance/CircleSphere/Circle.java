
import java.util.*;
class Circle
{
    double r;
    Circle()
    {
        r = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = sc.nextDouble();
    }
    double getArea()
    {
        return Math.PI*r*r;
    }
}