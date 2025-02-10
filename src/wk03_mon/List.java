package wk03_mon;

// List is Abstract Data Type

// Static attributes and methods belong to the class
// Non-static attribute and methods belong to the object
// [Class] -> [Obj1], [Obj2], .... [ObjN]
// You can use static attributes and methods from non-static methods, NOT the other way around

public class List {
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 50;

    public List(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // Add an item at the end of the list
    public void append(String item){
        if(size < data.length) {
            data[size++] = item;
        } else{
            System.out.println("List is full");
        }
    }

    // Add an item to a user defined location
    // Need to maintain the contigousness of the items
    // Example: If you have 5 items, you can insert at index from 0 to 5 (including the new item, you have 6 now)
    public void insert(String item, int index){
        if (size >= data.length){
            System.out.println("List is full");
        } else if(index >= 0 && index <= size){
            for(int i = size; i > index; i--){
                data[i] = data[i - 1];
            }
            data[index] = item;
            size++;
        } else{
            System.out.println("Invalid index");
        }
    }

    //Remove the item at index
    public void delete(int index){
        if(isEmpty()){
            System.out.println("List Empty");
        } else if(index < 0 || index >= size){
            System.out.println("Invalid Index");
        } else{
            for(int i = index; i < size - 1; i++){
                data[i] = data[i + 1];
            }
            //assign to null if you are not using an object
            data[size - 1] = null;
            size--;
        }
    }

    public String toString(){
        if(isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < size; i++){
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

//    public static void main(String[] args){
//        System.out.println("Test of List");
//        List aList = new List();
//        System.out.println(aList.isEmpty());
//    }
}
