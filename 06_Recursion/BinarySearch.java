
class BinarySearch
{
    static int search(int arr[], int f, int l, int n)
    {
        if(f>l)
        {
            return -1;
        }
        else
        {
            int m = (f+l)/2;
            if(arr[m] == n)
                return m;
            else if(n >arr[m])
                return search(arr, m+1,l,n);
            else
                return search(arr,f,m-1,n);
        }

    }
    public static void main(String args[])
    {
        int arr[] = {3,4,6,15};
        System.out.println("index is: " + search(arr,0,arr.length-1,10));
    }
}