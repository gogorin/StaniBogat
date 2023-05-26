package stanibogat1;

public class Node <T> {
    
    private T data;
    public Node next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node(T data)
    {
        setData(data);
    }
    
    
}
