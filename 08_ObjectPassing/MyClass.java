
class MyClass
{
    int n;
    MyClass(int n)
    {
        this.n = n;
    }
    void fun(MyClass ob)
    {
        n = n + ob.n;
    }
    void display()
    {
        System.out.println(n);
    }
    public static void main(String args[])
    {
        MyClass ob1 = new MyClass(1);
        MyClass ob2 = new MyClass(2);
        MyClass ob3 = new MyClass(3);
        ob1.fun(ob2);
        ob2.fun(ob3);
        ob1.display();
        ob2.display();
    }
}
