
class Duration
{
    int h,m;
    Duration(int h, int m)
    {
        this.h = h;
        this.m = m;
    }
    void add(Duration d)
    {
        m = m + d.m;
        h = h + d.h + m/60;
        m = m%60;
    }
    void display()
    {
        System.out.println(h+":"+m);
    }
    public static void main(String args[])
    {
        Duration d1 = new Duration(5,40);
        Duration d2 = new Duration(6,50);
        d1.add(d2);
        d1.display();
    }
}