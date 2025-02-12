package wk04_wed;

public class QueueRunner {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());
        q.dequeue();
        q.dequeue();
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());
        q.enqueue(9);
        q.enqueue(11);
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());
        q.enqueue(13);
        q.enqueue(17);
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());

    }
}
