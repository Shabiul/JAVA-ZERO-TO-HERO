
//Check Prime
class CheckPrime
{
    int i,c;
    CheckPrime()
    {
        i=1;
        c=0;
    }
    void count(int n)
    {
        if(i<=n)
        {
            if(n%i==0)
                c++;
            i++;
            count(n);
        }
    }
    void check(int n)
    {
        count(n);
        if(c==2)
            System.out.println("It is prime");
        else
            System.out.println("Not prime");
    }
    
    public static void main(String args[])
    {
        CheckPrime ob = new CheckPrime();
        ob.check(10);
    }
}