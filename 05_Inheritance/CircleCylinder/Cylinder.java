
import java.util.*;
class Cylinder extends Circle
{
    double h;
    Cylinder()
    {
        h = 0;
    }
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        h = sc.nextDouble();
    }
    double getVolume()
    {
        return getArea() * h;
    }
}