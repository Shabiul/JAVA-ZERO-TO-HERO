
class Student
{
    int roll;
    String name;
    Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    void display()
    {
        System.out.println("Roll: " + roll);
        System.out.println("Name : " + name);
    }
}