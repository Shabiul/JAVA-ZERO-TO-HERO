
class MarksDetail extends Student
{
    int marks;
    MarksDetail(int roll, String name, int marks)
    {
        super(roll, name);
        this.marks = marks;
        
    }
    void display()
    {
        super.display();
        System.out.println("Marks : " + marks);
    }
}