
class ArraySum
{
    static int sum(int arr[], int i)
    {
        if(i == arr.length-1)
            return arr[i];
        else
        {
           
            return arr[i] + sum(arr,i+1);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,5,6};
        System.out.println("Sum is: " + sum(arr,0));
    }
}