package wk05_mon;

// Implement a stack for characters
public class Stack {
    //Attributes
    private char[] data;
    private int top;
    public static final int DEFAULT_CAPACITY = 10;

    //Constructor
    public Stack(){
        data = new char[DEFAULT_CAPACITY];
        top = -1;
    }

    public Stack(int capacity){
        data = new char[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(char value){
        if(top == data.length - 1){
            System.out.println("Stack full, cannot push " + value);
            return false;
        } else{
            data[++top] = value;
            return true;
        }
    }

    //Removes an item for the stack
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack empty, cannot pop");
        } else{
            //data[top] = null; // Needed if managing objects
            top--;
        }
    }

    //Returns the top value of the stack
    //Return 0 if nothing in the stack
    public char top(){
        if(isEmpty()){
            return 0; //Define a garbage value in the context
        } else{
            return data[top];
        }
    }

    public String toString(){
        if(isEmpty()){
            return "Empty Stack";
        } else{
            StringBuffer sb = new StringBuffer();
            for(int i = top; i >= 0; i--){
                sb.append(data[i]);
            }
            return sb.toString();
        }
    }
}
