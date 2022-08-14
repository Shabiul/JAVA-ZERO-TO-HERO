
/*#

Topic recursive function to multiply two numbers by repetitive addition.

*/

class Multiply
{
    static int multiply(int a, int b)
    {
        if(b == 1)
            return a;
        else
            return a+multiply(a,b-1);
    }
}