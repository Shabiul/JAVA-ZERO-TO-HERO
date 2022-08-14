
class SumAndProduct extends Sum
{
    int p;
    SumAndProduct()
    {
        p = 0;
    }
    void computeProduct()
    {
        p = a*b;
    }
    void displayProduct()
    {
        System.out.println("Product is: " + p);
    }
}