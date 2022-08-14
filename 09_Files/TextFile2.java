
/*#

WAP to display all the palindrome words from a text file.

*/
import java.io.*;
import java.util.*;
class TextFile2
{
    public static void main(String args[])throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileInputStream("d:/filesamples/words.txt"));
        String w;
        while(sc.hasNext())
        {
            w = sc.next();
            if(w.equalsIgnoreCase(reverse(w)))
                System.out.println(w);
        }
        sc.close();
       
    }
    
    static String reverse(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
}