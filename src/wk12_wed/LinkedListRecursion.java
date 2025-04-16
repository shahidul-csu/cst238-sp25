package wk12_wed;

//Outer Class
public class LinkedListRecursion <T> {
    private Node first;

    public LinkedListRecursion(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    //Add new item at the end
    public void append(T data){
        if(isEmpty()){
            first = new Node(data);
        } else{
            first.append(data);
        }
    }

    public String toString(){
        if(isEmpty()){
            return "Empty String";
        } else{
            StringBuilder sb = new StringBuilder();
            Node n = first;
            while(n != null){
                sb.append(n.getData()).append(" -> ");
                n = n.getNext();
            }
            sb.append("null");
            return sb.toString();
        }
    }

    //Inner Class
    class Node{
        //Payload
        private T data;
        //Reference
        private Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        public T getData(){
            return data;
        }

        public boolean hasNext(){
            return next != null;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node n){
            next = n;
        }

        public void append(T data){
            //If the node is the last item in the list
            if(!hasNext()){
                setNext(new Node(data));
            } else{
                getNext().append(data);
            }
        }

        public String toString(){
            return data.toString();
        }
    }
}






