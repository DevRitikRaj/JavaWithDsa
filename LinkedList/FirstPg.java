package LinkedList;


public class FirstPg {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    // Adding will at the first position and last position

    public  void addFirst(int data){
        // step 1
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step 2 newNode next=head
        newNode.next=head;

        // Step 3 
        head=newNode;

    }

    // Add last 
    public  void addlast(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        // Step2 tail.next=newNode

        tail.next=newNode;

        // Step 3
        tail=newNode;
    
    
    
    }
    public  void printLinkedlist(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp=head;
        while (temp !=null) {
            System.out.print(temp.data+"---> ");
            temp=temp.next;
            
        }
        System.out.println("null");
    }

    public static void main(String [] args){
        FirstPg ll =new FirstPg();
        ll.printLinkedlist();
        ll.addFirst(2);
        ll.printLinkedlist();
        ll.addFirst(1);
        ll.printLinkedlist();
        ll.addlast(3);
        ll.printLinkedlist();
        ll.addlast(4);
        ll.printLinkedlist();



    }

    
}
