
class Main14
{
    public static void main(String args[])
    {
        //Calculator ob = new Calculator();
        
        MyCalculator ob = new MyCalculator();
        fun(ob);
    }
    
    static void fun(Calculator c)
    {
        System.out.println(c.sum(3,4));
        c.factorial(5);
    }
}