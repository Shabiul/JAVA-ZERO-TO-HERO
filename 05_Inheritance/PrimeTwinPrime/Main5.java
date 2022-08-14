
class Main5
{
    public static void main(String args[])
    {
        TwinPrime ob = new TwinPrime();
        ob.input();
        if(ob.areTwinPrime())
            System.out.println("Yes it is");
        else
            System.out.println("Not twin prime");
            
    }
}