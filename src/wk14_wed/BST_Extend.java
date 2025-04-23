package wk14_wed;

public class BST_Extend {
    private Node root;
    public BST_Extend(){
        root = null;
    }

    public int sum(){
        if(isEmpty()){
            return 0;
        } else{
            return root.sum();
        }
    }

    public int count(){
        if(isEmpty()){
            return 0;
        } else{
            return root.count();
        }
    }
    
    public boolean search(int key){
        if(isEmpty()){
            return false;
        } else{
            return root.search(key);
        }
    }
    
    public BST_Extend add(int value){
        if(isEmpty()){
            root = new Node(value);
        } else{
            root.add(value);
        }
        return this;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
}

class Node{
    //Payload
    private int data;
//    private int freq;
    //Reference
    private Node left;
    private Node right;

    public Node(int value){
        data = value;
//        freq = 1;
        left = null;
        right = null;
    }
    
    public int sum(){
        int res = data;
        if(hasLeft()){
            res += left.sum();
        }
        if(hasRight()){
            res += right.sum();
        }
        return res;
    }

    public int count(){ 
        int count = 1;
        if(hasLeft()){
            count += left.count();
        }
        if(hasRight()){
            count += right.count();
        }
        return count;
    }

    public boolean search(int key){
        if(key == data){
            return true;
        } else if(key < data){
            if(hasLeft()){
                return left.search(key);
            } else{
                return false;
            }
        } else{
            if(hasRight()){
                return right.search(key);
            } else{
                return false;
            }
        }
    }

    public void add(int value){
        if(value == data){
            System.out.println("Data is already there");
        } else if(value < data){
            if(hasLeft()){
                left.add(value);
            }else{
                left = new Node(value);
            }
        } else{
            if(hasRight()){
                right.add(value);
            } else{
                right = new Node(value);
            }
        }
    }

    public int getData(){
        return data;
    }

    public boolean hasLeft(){
        return left != null;
    }

    public boolean hasRight(){
        return right != null;
    }

}

