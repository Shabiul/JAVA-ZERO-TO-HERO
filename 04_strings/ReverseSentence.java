
/*

WAP to accept a sentence and count number of words starting with capital letter.

*/

import java.util.*;
class ReverseSentence
{
    private String s;
    private String rs;
    
    public ReverseSentence()
    {
        s = "";
        rs ="";
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        s = sc.nextLine();
    }
    public void compute()
    {
        StringTokenizer st = new StringTokenizer(s);
        String w;
        while(st.hasMoreTokens())
        {
            w = st.nextToken();
            rs = w + " " + rs;
        }
    }
    public void display()
    {
        System.out.println("Resulting Sentence: " + rs);
    }
    public static void main(String args[])
    {
        ReverseSentence ob = new ReverseSentence();
        ob.input();
        ob.compute();
        ob.display();
    }
}