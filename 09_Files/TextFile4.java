
/*#

WAP to count number of lines starting with a capital letter.
 (use bufferedreader)

*/
import java.io.*;
class TextFile4
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/filesamples/lines.txt")));
        int c;
        String line;
        c=0;
        while(true)
        {
            line = br.readLine();
            if(line==null)
                break;
            if(Character.isUpperCase(line.charAt(0)))
                c++;
        }
        br.close();
        System.out.println("Number of such lines: " + c);
        
    }
}