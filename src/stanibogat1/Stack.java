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
    
    public T pop()
    {
        Node current;
        current=head.next;
        if(head==null){
            System.out.println("Empty stack");
        }
        
            head.next=current.next;
            return (T) head.next;
        
    }
    
    public int size()
    {
        Node node=head;
        if(node.next==null){
            return 0;
        }
        else{
            int counter=0;
            while(node.next!=null){
                counter++;
                node=node.next;
            }
            return counter;
        }
        
    }
}
