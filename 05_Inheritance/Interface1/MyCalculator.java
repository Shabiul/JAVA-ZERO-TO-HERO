
class MyCalculator implements Calculator
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    public void factorial(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
            f*=i;
        System.out.println("Factorial is: " + f);
    }
}