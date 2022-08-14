
//WAP to store roll, name, marks of a student into a text file and read the data back.

import java.util.*;
import java.io.*;
class RecordReadWrite
{
    public static void main(String args[]) throws FileNotFoundException
    {
        int roll;
        String name;
        int marks;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of book:");
        System.out.print("Roll: ");
        roll = Integer.parseInt(sc.nextLine());
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Marks: ");
        marks = Integer.parseInt(sc.nextLine());
        
        PrintWriter pw = new PrintWriter(new FileOutputStream("stud.txt"));
        pw.println(roll+";"+name+";"+marks+";");
        pw.close();
        
        Scanner scfile = new Scanner(new FileInputStream("stud.txt"));
        scfile.useDelimiter(";");
        roll = Integer.parseInt(scfile.next());
        name = scfile.next();
        marks = Integer.parseInt(scfile.next());
        
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        scfile.close();
        
    }
}