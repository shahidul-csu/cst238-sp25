package wk04_mon;

public class Stack {
    private String[] data;
    public static final int DEFAULT_CAPACITY = 5;
    //Top is going to point to the top item in the stack
    private int top;

    public Stack(){
        data = new String[DEFAULT_CAPACITY];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(String item){
        if(top == data.length - 1){
            System.out.println("Stack is full, cannot push");
        } else{
            data[++top] = item;
        }
    }

    public String top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        } else{
            return data[top];
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack Empty, nothing to pop");
        } else{
            data[top] = null;
            top--;
        }
    }
}
