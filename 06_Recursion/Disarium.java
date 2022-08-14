
class Disarium
{
    int num;
    int size;
    Disarium(int nn)
    {
        num = nn;
        size = 0;
    }
    void countDigit()
    {
        size = (num+"").length();
    }
    int sumOfDigits(int n, int p)
    {
        if(p==0)
            return 0;
        else
            return (int)Math.pow(n%10,p) + sumOfDigits(n/10,p-1);
    }
    void check()
    {
        int s;
        countDigit();
        s = sumOfDigits(num,size);
        if(s == num)
            System.out.println("It is disarium");
        else
            System.out.println("Not disarium");
    }
    public static void main(String args[])
    {
        Disarium ob = new Disarium(135);
        ob.check();
    }
}