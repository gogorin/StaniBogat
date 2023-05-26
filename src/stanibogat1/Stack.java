package stanibogat1;

public class Stack <T>
{
    public Node head = new Node(null);
    
    public void push(T element)
    {
        Node current;
        current=new Node(element);
        if(head==null){
            head.next=current;
        }
        else
        {
            current.next=head.next;
            head.next=current;
        }
    }
    
    public void pop()
    {
        Node current;
        current=head.next;
        if(head==null){
            System.out.println("Empty stack");
        }
        else
        {
            head.next=current.next;
        }
    }
}
