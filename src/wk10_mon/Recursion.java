package wk10_mon;

public class Recursion {
    public static void main(String[] args){
        //foo();
        counter(3);
        System.out.println();
        System.out.println("Sum: " + sum(5));

        int[] data = {5, 2, 7, 4};
        print(data, 7);
        System.out.println("Max: " + maxInArray(data, 0));
    }
    public static int maxInArray(int[] data, int start){
        if(start == data.length - 1){
            return data[start];
        }
        return Math.max(data[start], maxInArray(data, start + 1));
    }
    public static void print(int[] data, int size){
        if(size > data.length){
            System.out.println("Size is larger than data capacity");
            return;
        }
        if(size == 0){
            return;
        }
        // Print the value at index size - 1
        System.out.print(data[size - 1] + " ");
        print(data, size - 1);
//        System.out.print(data[size - 1] + " ");
    }

    //Return the sum from 1 to n
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void counter(int n){
        if (n <= 0){
            return;
        }
        System.out.print(n + " ");
        counter(n-1);
        System.out.print(n + " ");
    }

    //Never Ending Method Call
    public static void foo(){
        System.out.println("In Foo");
        foo();
    }
}
