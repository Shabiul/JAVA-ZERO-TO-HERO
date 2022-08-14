
import java.util.*;
class StringStack
{
    String arr[];
    int top;
    int cap;
    StringStack(int cap)
    {
        this.cap = cap;
        arr = new String[cap];
        top=-1;
    }
    void push(String s)
    {
        if(top == cap-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[++top]=s;
        }
    }
    String pop()
    {
        if(top == -1)
        {
            return "?";
        }
        else
        {
            return arr[top--];
        }
    }
    void display()
    {
        System.out.println("The elements are: ");
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
            
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringStack ob = new StringStack(20);
        int ch;
        String s;
        do
        {
            System.out.println("Select an option: ");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. exit");
            ch = Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1: 
                    System.out.println("Enter the string to push: ");
                    s = sc.nextLine();
                    ob.push(s);
                break;
                case 2:
                    s = ob.pop();
                    if(s.equals("?"))
                        System.out.println("No elements");
                    else
                        System.out.println("Popped value is: " +s);
                break;
                case 3:
                    ob.display();
                break;
                case 4:
                    System.out.println("Exited.");
                break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(ch!=4);
    }
}
