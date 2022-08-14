
//Count Factors
class CountFactors
{
    int i,c;
    CountFactors()
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
    void display()
    {
        System.out.println("Number of factors: " + c);
    }
    
    public static void main(String args[])
    {
        CountFactors ob = new CountFactors();
        ob.count(10);
        ob.display();
    }
}