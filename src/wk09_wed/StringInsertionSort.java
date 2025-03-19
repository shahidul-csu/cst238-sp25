package wk09_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringInsertionSort {
    public static void main(String[] args) throws IOException {
        String[] data = loadDataFromFile("src/wk09_wed/data.txt");
        print(data);
        System.out.println();
        insertionSort(data);
        print(data);
    }

    public static void insertionSort(String[] data){
        for(int i = 0; i < data.length; i++){
            int k = i;
//            while(k > 0 && data[k].compareTo(data[k-1]) < 0){
            while(k > 0 && data[k].length() < data[k-1].length()){
                swap(data, k, k-1);
                k--;
            }
        }
    }

    public static void swap(String[] data, int index1, int index2){
        String temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void print(String[] data){
        for(String word : data){
            System.out.println(word + " (" +  word.length() + ")");
        }
    }

    public static String[] loadDataFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);
        int count = fin.nextInt();
        String[] data = new String[count];
        for(int i = 0; i < count; i++){
            data[i] = fin.next();
        }
        return data;
    }
}
