
//2019
import java.util.*;
class Record
{
    String n[];
    int m[];
    int size;
    Record(int cap)
    {
        size = cap;
        n = new String[size];
        m = new int[size];
    }
    void readArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, marks of " + size + " students: ");
        for(int i=0;i<size;i++)
        {
            n[i] = sc.nextLine();
            m[i] = Integer.parseInt(sc.nextLine());
        }
    }
    void display()
    {
        System.out.println("The array elements are: ");
        System.out.println("Name\tMarks");
        for(int i=0;i<size;i++)
        {
            System.out.println(n[i]+"\t" + m[i]);
        }
    }
}