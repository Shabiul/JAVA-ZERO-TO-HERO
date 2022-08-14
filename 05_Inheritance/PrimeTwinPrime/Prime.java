
class Prime
{
    int n;
    Prime()
    {
        n=0;
    }
  
    boolean isPrime()
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        return c==2;
    }
}