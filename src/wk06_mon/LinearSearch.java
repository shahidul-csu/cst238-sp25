package wk06_mon;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        int size = 15;
        int[] data = new int[size];
        //Random rand = new Random();
        Random rand = new Random(3);
        for(int i = 0; i < data.length; i++){
            data[i] = getRandom(rand, 1, size);
        }
        print(data);
        System.out.println("Max value in the data: " + max(data));

        Scanner s = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter a number: ");
            num = s.nextInt();
            System.out.println("Is " + num + " in the data? " + search(data, num));
            System.out.println("The index of " + num + " in the data: " + searchIndex(data, num));
            System.out.println("The last index of " + num + " in the data: " + searchIndexReverse(data, num));
            ArrayList<Integer> al = searchAllIndex(data, num);
            System.out.println(al);
        }while(num > 0);
    }

    public static ArrayList<Integer> searchAllIndex(int[] data, int value){
        ArrayList<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < data.length; i++){
            if(data[i] == value) {
                indexList.add(i);
            }
        }
        return indexList;
    }

    //Return last index if found, return -1 otherwise
    public static int searchIndexReverse(int[] data, int value){
        for(int i = data.length - 1; i >= 0; i--){
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }

    //Return index if found, return -1 otherwise
    public static int searchIndex(int[] data, int value){
        for(int i = 0; i < data.length; i++){
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] data){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    public static boolean search(int[] data, int value){
        for(int i = 0; i < data.length; i++){
            if(data[i] == value){
                return true;
            }
        }
        return false;
    }

    public static void print(int[] data){
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static int getRandom(Random r, int start, int range){
        return Math.abs(r.nextInt()) % range + start;
    }
}
