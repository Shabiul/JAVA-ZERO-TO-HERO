
class LinkedListIntro
{
    public static void main(String args[])
    {
        Node n1 = new Node();
        n1.num = 10;
        n1.link = null;
        
        Node n2 = new Node();
        n2.num = 20;
        n2.link = null;
        n1.link = n2;
        
        Node n3 = new Node();
        n3.num=50;
        n3.link = null;
        n2.link = n3;
        
        Node tn;
        for(tn=n1;tn!=null;tn=tn.link)
        {
            System.out.println(tn.num);
        }
        
    }
}