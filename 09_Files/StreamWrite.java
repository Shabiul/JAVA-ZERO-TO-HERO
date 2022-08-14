
//WAP to write a line into a text file
import java.io.*;
import java.util.*;
class StreamWrite
{
    public static void main(String args[]) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter(new FileOutputStream("d:/filesamples/streams.txt"));
        pw.println("Hello");
        pw.close();
    }
}