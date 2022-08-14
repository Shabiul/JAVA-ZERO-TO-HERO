

//WAP in java to accept a binary number and convert to decimal equivalent

import java.util.*;
class BinToDeciString
{
    String bin;
    int deci;
    BinToDeciString()
    {
        bin="";
        deci=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        bin = sc.next();
    }
    public void compute()
    {
        int i,l,p, digit;
        l = bin.length();
        p=l-1;
        for(i=0;i<l;i++)
        {
            digit = bin.charAt(i)-48;
            deci += digit * (int)Math.pow(2,p);
            p--;
        }
    }
    public void display()
    {
        System.out.println("Decimal is: " + deci);
    }
    public static void main(String args[])
    {
        BinToDeciString ob = new BinToDeciString();
        ob.input();
        ob.compute();
        ob.display();
    }
}