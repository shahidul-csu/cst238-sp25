package wk03_wed;

// List is Abstract Data Type

public class ListExtend {
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 5;

    public ListExtend(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public ListExtend(int capacity){
        data = new String[capacity];
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String get(int index){
        if(index < 0 || index >= size){
            return null;
        } else{
            return data[index];
        }
    }

    public String firstLetter(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            sb.append(data[i].charAt(0));
        }
        return sb.toString();
    }

    public int countChar(){
        int chCount = 0;
//        System.out.println(data.length);
        for(int i = 0; i < size; i++){
            chCount += data[i].length();
        }
        return chCount;
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
}
