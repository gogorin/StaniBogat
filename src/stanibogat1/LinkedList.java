package stanibogat1;

import stanibogat1.Node;


public class LinkedList <T> 
{
    public Node head=new Node(0);
    public int size(){
        if(head==null){
            return 0;
        }else {
            Node currNode=head;
            int size=0;
            while (currNode.next!=null){
                size++;
                currNode=currNode.next;

            }
            return size;
        }
    }
    public void add(int element){
        Node curr;
        if(head==null){
            curr=new Node(element);
            head.next=curr;
        }else{
            curr=head;
            while (curr.next!=null){
                curr=curr.next;

            }
            curr.next=new Node(element);



        }

    }
    public T get(int index){
        Node Node;
        if(index<0  || index>size()){
            
        }
        if(index==0){
            Node=head.next;
            return  (T) Node.getData();
        }
        else{

            Node=head.next;

            int br=1;
            while (Node!=null){
                if(br==index+1){
                    break;
                }
                br=br+1;
                Node=Node.next;

            }
            return  (T) Node.getData();
        }
    }
   

    public void removeLast(){
        Node Node=head.next;
        Node prevNode=head;
        while (Node.next!=null){
            prevNode=prevNode.next;
            Node=Node.next;
        }

        prevNode.next=null;
    }



    public void add(int index,int element){
        if(index<0 || index>size()-1){
            return;
        }
        Node Node=head;

        int br=0;
        while (Node.next!=null){
            if(br==index){
                Node newel=new Node(element);
                Node nextel=Node.next;
                Node.next=newel;
                newel.next=nextel;
            }
            Node=Node.next;
            br++;
        }


    }
   



    public String toString() {
        String otg="";
        Node Node=head.next;
        for (int i = 0; i < size(); i++) {

            otg+=Node.getData()+" ";
            Node=Node.next;

        }
        return String.format("%d - size \n %s - elementi \n ",size(),otg);
    }
}
