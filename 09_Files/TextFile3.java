
/*#

WAP to copy the lines larger than 20 characters to another file.

*/
import java.io.*;
import java.util.*;
class TextFile3
{
    public static void main(String args[])throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileInputStream("d:/filesamples/file1.txt"));
        PrintWriter pw = new PrintWriter(new FileOutputStream("d:/filesamples/file2.txt"));
        String line;
        while(sc.hasNext())
        {
            line = sc.nextLine();
            if(line.length()>20)
                pw.println(line);
            
        }
        sc.close();
        pw.close();
        
    }
}