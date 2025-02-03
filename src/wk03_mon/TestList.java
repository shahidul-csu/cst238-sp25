package wk03_mon;

public class TestList {
    public static void main(String[] args){
        System.out.println("Testing from outside");
        List aList = new List();
        System.out.println(aList.isEmpty());
        aList.append("Dog");
        aList.append("Cat");
        aList.append("Bird");
        aList.append("Fish");
        System.out.println(aList);
        aList.insert("Hamster", 7);
        aList.insert("Hamster", 1);
        System.out.println(aList);
        aList.delete(0);
        System.out.println(aList);
    }
}
