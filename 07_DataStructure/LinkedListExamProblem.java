

void FindNode(Node str, int b)
{
    Node tn;
    for(tn = str;tn!=null;tn=tn.link)
    {
        if(tn.n == b)
            break;
    }
    if(tn == null)
        System.out.println("Not found");
    else
        System.out.println("Found");
}