
class NumberReverse
{
    int r;
    NumberReverse()
    {
        r = 0;
    }
    void reverse(int n)
    {
        if(n>0)
        {
            int digit = n%10;
            r = r*10 + digit;
            reverse(n/10);
        }
    }
    void display()
    {
        System.out.println("Reverse is: " + r);
    }
    public static void main(String args[])
    {
        NumberReverse ob = new NumberReverse();
        ob.reverse(123);
        ob.display();
    }
}