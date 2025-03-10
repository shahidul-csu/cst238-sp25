package wk08_mon;

import java.util.Random;
import java.util.Scanner;

public class SimpleComplexity {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        int[] data = generateData(size);
        System.out.println(bar(data));
        System.out.println(foo(data));
    }

    //Time Complexity: O(n)
    public static long bar(int[] data){
        long sum = 0;
        int count = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i];
            count++;
        }
        System.out.println("Total Iteration: " + count);
        return sum * data.length;
    }

    // Time Complexity: O (n^2)
    public static long foo(int[] data){
        long sum = 0;
        int count = 0;
        for(int i = 0; i < data.length; i++){ // < : (n + 1)
            for(int k = 0; k < data.length; k++){ // < : n * (n + 1) = n^2 + n
                sum += data[i];
                count++;
            }
        }
        System.out.println("Total Iteration: " + count);
        return sum;
    }

    public static int[] generateData(int size){
        Random r = new Random(0);
        int[] data = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = r.nextInt(100);
        }
        return data;
    }
}
