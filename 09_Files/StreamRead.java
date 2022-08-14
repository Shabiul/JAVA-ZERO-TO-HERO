
//WAP to read the first line of a text file and display on screen.

import java.io.*;
import java.util.*;
class StreamRead
{
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileInputStream("d:/filesamples/streams.txt"));
        String s = sc.nextLine();
        System.out.println("Data read: " + s);
        sc.close();
    }
}