
/*#

Topic recursive function for integer power calculation

*/

class Power
{
    static int pow(int a, int b)
    {
        if(b == 0)
            return 1;
        else if(b == 1)
            return a;
        else
            return a*pow(a,b-1);
    }
}