
class Main7
{
    public static void main(String args[])
    {
        double v;
        Cylinder ob = new Cylinder();
        ob.input();
        v = ob.getVolume();
        System.out.println("Volume is: " + v);
    }
}