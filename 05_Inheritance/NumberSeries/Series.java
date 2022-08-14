
class Series extends Number
{
    int sum;
    Series(int nn, int sum)
    {
        super(nn);
        this.sum = sum;
    }
    void calsum()
    {
        for(int i=1;i<=n;i++)
        {
            sum+= factorial(i);
        }
    }
    void display()
    {
        super.display();
        System.out.println("Sum is: " + sum);
    }
}