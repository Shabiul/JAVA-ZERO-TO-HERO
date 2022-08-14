
class Main6
{
    public static void main(String args[])
    {
        double v;
        Sphere ob = new Sphere();
        ob.input();
        v = ob.getVolume();
        System.out.println("Volume is: " +v);
    }
}