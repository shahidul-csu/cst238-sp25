package wk11_mon;

public class LinkedList {
    private Node first;
    public LinkedList(){
        System.out.println("Linked List Constructor Called");
        first = null;
    }
    public boolean isEmpty(){
        return first == null;
    }

    //Add an item at the end
    public void append(int value){
        if(isEmpty()){
            first = new Node(value);
        } else{
            Node last = first;
            while(last.hasNext()){
                last = last.getNext();
            }
            last.setNext(new Node(value));
        }
    }

    public String toString(){
        if (isEmpty()){
            return "Empty Linked List";
        } else{
            StringBuilder sb = new StringBuilder();
            Node current = first;
            while(current != null){
                sb.append(current.getData()).append(" ");
                current = current.getNext();
            }
            return sb.toString();
        }
    }
}

class Node{
    //Payload
    private int data;
    // Reference to the next node in the Linked List
    private Node next;

    public Node(int data){
        System.out.println("Node Constructor Called");
        this.data = data;
        this.next = null;
    }

    public Node getNext(){
        return next;
    }

    public boolean hasNext(){
        return next != null;
    }

    public void setNext(Node n){
        next = n;
    }

    public int getData(){
        return this.data;
    }

    public String toString(){
        return "" + data;
    }
}