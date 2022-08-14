
//HCF
class HCFFinder
{
    int hcf(int a, int b)
    {
        if(a%b == 0)
            return b;
        else
            return hcf(b,a%b);
    }
    public static void main(String args[])
    {
        HCFFinder ob = new HCFFinder();
        System.out.println(ob.hcf(60,80));
    }
}