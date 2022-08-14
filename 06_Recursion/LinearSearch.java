
class LinearSearch
{
    static int search(int arr[], int n, int i)
    {
        if(i==arr.length)
        {`
            return -1;
        }
        else if(arr[i] == n)
        {
            return i;
        }
        else
        {
            return search(arr,n,i+1);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,15,6};
        System.out.println("Sum is: " + search(arr,10,0));
    }
}