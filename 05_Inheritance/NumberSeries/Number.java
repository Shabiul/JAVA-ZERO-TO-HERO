
//2018
class Number
{
    int n;
    Number(int nn)
    {
        n = nn;
    }
    int factorial(int a)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f*=1;
        }
        return f;
    }
    void display()
    {
        System.out.println("The number is: " + n);
    }
}
