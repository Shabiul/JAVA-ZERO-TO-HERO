
class LargestFinder
{
    static int largest(int arr[], int i)
    {
        if(i==arr.length-1)
        {
            return arr[i];
        }
        else
        {
            return Math.max(arr[i],largest(arr,i+1));
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,15,6};
        System.out.println("largest is: " + largest(arr,0));
    }
}