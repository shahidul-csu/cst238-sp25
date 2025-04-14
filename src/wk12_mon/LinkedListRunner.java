package wk12_mon;

public class LinkedListRunner {
    public static void main(String[] args){
        LinkedList2 li = new LinkedList2();
        System.out.println(li);
        li.append(5).prepend(7);
        li.append(11);
        li.append(14).append(16);
        System.out.println(li);
        li.prepend(3).prepend(2);
        System.out.println(li);
        System.out.println("Even count: " + li.countEven());
    }
}
