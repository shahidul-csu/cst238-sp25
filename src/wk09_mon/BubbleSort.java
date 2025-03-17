package wk09_mon;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {5, 2};
        System.out.println("a: " + array[0] + ", b: " + array[1]);
        swap(array, 0, 1);
        System.out.println("a: " + array[0] + ", b: " + array[1]);
        System.out.println();

        int a = 5, b = 2;
        // Prints a: 5, b: 2
        System.out.println("a: " + a + ", b: " + b);
        badSwap(a, b);
        // Want to print a: 2, b: 5
        System.out.println("a: " + a + ", b: " + b);

        int[] data = {5, 7, 1, 9, 3, 0, 6, 8, 2, 4, 7};
        print(data);
        System.out.println();
        bubbleSort(data);
//        print(data);
    }

    public static void bubbleSort(int[] data){
        print(data);
        for(int k = 0; k < data.length - 1; k++){ // Outer loop
            boolean swapped = false;
            for (int i = 0; i < data.length - k - 1; i++) { // Inner loop can stop early
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            print(data);
            if (!swapped){
                System.out.println("Stopped early at iteration " + k);
                break;
            }
        }

    }

    public static void swap(int[] data, int ind1, int ind2){
        int temp = data[ind1];
        data[ind1] = data[ind2];
        data[ind2] = temp;
//        System.out.println("data[" + ind1 + "]: " + data[ind1] + ", data[" + ind2 + "]: " + data[ind2]);
    }

    public static void print(int[] data){
        for(int n : data){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void badSwap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }
}
