package wk07_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchFun {
    public static void main(String[] args) throws IOException{
        int[] data = new int[20];
        int count = readFile(data);
        print(data, count);
        int num = 6;
        System.out.println("Is data sorted? " + isSorted(data, count));
        if(isSorted(data, count)){
            System.out.println(num + " location: " + binarySearch(data, count, num));
        } else {
            System.out.println(num + " location: " + search(data, count, num));
        }
    }

    public static boolean isSorted(int[] data, int count){
        for(int i = 0; i < count - 1; i++){
            if(data[i] > data[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] data, int count, int key){
        int low = 0;
        int high = count - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(key == data[mid]){
                return mid;
            } else if(key > data[mid]){
                // Check right
                low = mid + 1;
            } else{
                // Check left
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] data, int count, int key){
        int index = -1;
        for(int i = 0; i < count; i++){
            if(data[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void print(int[] data, int count){
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Read a file with integers and store it in an array
    public static int readFile(int[] data) throws IOException {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String fileName = cin.next();
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);

        int count = 0;
        while(fin.hasNextInt() && count < data.length){
            data[count++] = fin.nextInt();
        }

        fr.close();
        return count;
    }
}
