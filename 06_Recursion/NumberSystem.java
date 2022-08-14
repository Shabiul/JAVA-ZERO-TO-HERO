
class NumberSystem
{
    int r;
    int i;
    NumberSystem()
    {
        r = 0;
        i=0;
    }
    void convert(int n)
    {
        if(n>0)
        {
            int digit = n%10;
            r += digit * (int)Math.pow(2,i);
            i++;
            convert(n/10);
        }
    }
    void display()
    {
        System.out.println("Decimal is: " + r);
    }
    public static void main(String args[])
    {
        NumberSystem ob = new NumberSystem();
        ob.convert(1111);
        ob.display();
    }
}