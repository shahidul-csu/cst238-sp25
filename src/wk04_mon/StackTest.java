package wk04_mon;

public class StackTest {
    public static void main(String[] args){
        Stack aStack = new Stack();
        System.out.println(aStack.isEmpty());
        aStack.push("A");
        aStack.push("B");
        aStack.push("C");
        aStack.pop();
        aStack.push("D");
        aStack.push("E");
        while(!aStack.isEmpty()){
            System.out.println(aStack.top());
            aStack.pop();
        }
    }
}
