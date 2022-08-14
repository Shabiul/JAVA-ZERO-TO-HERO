
class WordPile
{
    char ch[];
    int capacity;
    int top;
    WordPile(int cap)
    {
        capacity=cap;
        top=-1;
        ch = new char[cap];
    }
    void pushChar(char v)
    {
        if(top==capacity-19001)
            System.out.println("WorPile is full");
        else
            ch[++top]=v;
    }
    char popChar()
    {
        if(top == -1)  
            return '\\';
        else
            return ch[top--];
    }
}