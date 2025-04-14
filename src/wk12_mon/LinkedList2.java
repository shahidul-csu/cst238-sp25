package wk12_mon;

public class LinkedList2 {
    private Node first;

    public LinkedList2(){
        first = null;
    }

    //Return the number of even
    public int countEven(){
        if(isEmpty()){
            return 0;
        } else{
            int count = 0;
            Node n = first;
            while(n != null){
                if(n.getNum() % 2 == 0){
                    count++;
                }
                n = n.getNext();
            }
            return count;
        }
    }

    //Add an item at the beginning of the list
    public LinkedList2 prepend(int data){
        if (isEmpty()){
            first = new Node(data);
        } else{
            Node n = new Node(data);
            n.setNext(first);
            first = n;
        }
        return this;
    }

    //Add an item at the end of the list
    public LinkedList2 append(int data){
        if(isEmpty()){
            first = new Node(data);
        } else{
            Node current = first;
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
        return this;
    }

    public String toString(){
        if (isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            Node current = first;
            while (current != null){
                sb.append(current.getNum()).append(" -> ");
                current = current.getNext();
            }
            sb.append("null");
            return sb.toString();
        }
    }

    public boolean isEmpty(){
        return first == null;
    }


}

class Node{
    //Payload
    private int num;
//    double value;
//    String word;

    //Reference to the next item
    private Node next;
    public Node(int num){
        this.num = num;
        this.next = null;
    }

    public boolean hasNext(){
        return next != null;
    }

    public Node getNext(){
        return next;
    }

    public int getNum(){
        return num;
    }

    public void setNext(Node n){
        this.next = n;
    }

    public String toString(){
        return Integer.toString(num);
    }
}