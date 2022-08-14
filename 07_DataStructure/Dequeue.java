
class Dequeue
{
    int arr[] = new int[100];
    int lim;
    int front;
    int rear;
    Dequeue(int l)
    {
        lim = l;
        front = rear = 0;
    }
    void addrear(int val)
    {
        if(rear == lim)
            System.out.println("Overflow from the rear.");
        else
            arr[rear++]=val;
    }
    int popfront()
    {
        if(front == rear)
            return -9999;
        else
            return arr[front++];
    }
    void addfront(int val)
    {
        if(front == 0)
            System.out.println("Overflow from the front");
        else
            arr[--front]=val;
    }

    int poprear()
    {
        if(front == rear)
            return -9999;
        else
            return arr[--rear];
    }
}