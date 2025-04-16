package wk12_wed;

public class LinkedListRecursionTest {
    public static void main(String[] arg){
        LinkedListRecursion<Integer> ll1 = new LinkedListRecursion<>();
        ll1.append(5);
        ll1.append(8);
        System.out.println(ll1);
        LinkedListRecursion<String> ls1 = new LinkedListRecursion<>();
        ls1.append("Hello");
        ls1.append("Hola");
        ls1.append("Ciao");
        System.out.println(ls1);
    }
}
