package wk14_wed;

public class BST_Extend_Test {
    public static void main(String[] args){
        BST_Extend b1 = new BST_Extend();
        System.out.println("Node count: " + b1.count());
        System.out.println("Tree sum: " + b1.sum());
        System.out.println(b1.search(5));
        b1.add(8);
        System.out.println("Node count: " + b1.count());
        System.out.println("Tree sum: " + b1.sum());
        System.out.println(b1.search(5));
        b1.add(5);
        b1.add(1);
        b1.add(6);
        b1.add(10);
        b1.add(12);
        System.out.println("Node count: " + b1.count());
        System.out.println("Tree sum: " + b1.sum());
        System.out.println(b1.search(5));
        System.out.println(b1.search(7));
    }
}

