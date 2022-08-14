
/*#

WAP to count the capital letters from a text file.

*/
import java.io.*;
class TextFile
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        FileInputStream fis;
        int c;
        fis = new FileInputStream("d:/filesamples/myfile.txt");
        c=0;
        while(true)
        {
            int v = fis.read();
            if(v==-1)
                break;
            if(Character.isUpperCase((char)v))
                c++;
        }
        
        fis.close();
        System.out.println("Number of capital: " + c);
    }
}