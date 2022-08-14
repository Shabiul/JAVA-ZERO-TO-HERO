
//WAP to read a text file one character at a time and print on screen.

import java.io.*;
class Files
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("d:/filesamples/package.bluej");
        while(true)
        {
            int ch = fis.read();
            
            if(ch==-1)
                break;
            
            System.out.print((char)ch);
            
        }
        fis.close();
    }
}