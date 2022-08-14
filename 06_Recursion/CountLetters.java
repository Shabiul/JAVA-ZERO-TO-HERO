
class CountLetters
{
    int c;
    CountLetters()
    {
        c=0;
    }
    void count(String s)
    {
        if(s.length()>=1)
        {
            if(Character.isDigit(s.charAt(0)))
                c++;
            count(s.substring(1));
        }
    }
    void display()
    {
        System.out.println("Number of letters: " + c);
    }
    public static void main(String argsf[])
    {
        CountLetters ob = new CountLetters();
        ob.count("A123b?");
        ob.display();
    }
}