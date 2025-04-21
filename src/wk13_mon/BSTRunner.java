package wk13_mon;

public class BSTRunner {
    public static void main(String[] args){
        BST b1 = new BST();
        System.out.println(b1);
        b1.add(7);
        b1.add(5);
        b1.add(10);
        b1.add(6);
        b1.add(3);
        b1.add(8);
        b1.preOrder();
    }
}
