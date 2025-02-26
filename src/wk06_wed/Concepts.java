package wk06_wed;

import java.util.Random;

public class Concepts {
    //Attributes
    private int size;
    private int[] data;
    private String state;
    public static final double PI = 3.14159;

    public Concepts(int capacity){
        data = new int[capacity];
        size = 0;
        state = "Offline";
    }

    //Get method, accessor
    public String getState(){
        return state;
    }

    //Set method, mutator
    public void setState(String aState){
        if(aState.equals("Online") || aState.equals("Offline") || aState.equals("Done")) {
            state = aState;
        }
    }

    public static int getRandom(int start, int range){
        Random rand = new Random();
        return Math.abs(rand.nextInt()) % range + start;
    }

    public void populateData(){
        for(int i = 0; i < data.length; i++){
            data[i] = getRandom(1, 10);
        }
        size = data.length;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
