
class Highest extends Record
{
    int ind;
    Highest(int ind, int cap)
    {
        super(cap);
        this.ind = ind;
    }
    void find()
    {
        ind = 0;
        for(int i=1;i<size;i++)
        {
            if(m[i]>m[ind])
                ind=i;
        }
    }
    void display()
    {
        super.display();
        System.out.println("Highest Scorer Details: ");
        System.out.println("Name: " + n[ind]);
        System.out.println("Marks: " + m[ind]);
    }
}