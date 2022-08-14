
class Employee2 extends Person
{
    double salary = 100000;
    void display()
    {
        super.display();
        System.out.println("Salary is: " + salary);
    }
}