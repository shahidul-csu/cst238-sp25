package wk06_wed;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(Concepts.getRandom(11, 10));
        //Calling Static Method
        System.out.println(Math.pow(2, 5));
        //Creating object
        Random rand = new Random();
        //Calling method through object
        System.out.println(rand.nextInt());
        //Accessing static attribute
        System.out.println(Concepts.PI);
        Concepts c1 = new Concepts(10);
        Concepts c2 = new Concepts(20);

        System.out.println(c1.getState());
        System.out.println(c2.getState());

        c1.setState("Online");
        c2.setState("Done");

        System.out.println(c1.getState());
        System.out.println(c2.getState());

        c1.populateData();
        c2.populateData();

        System.out.println(c1);
        System.out.println(c2);

//        Concepts[] cArray = new Concepts[100];
//        for(int i = 0; i < cArray.length; i++){
//            cArray[i] = new Concepts();
//        }
//
//        for(int i = 0; i < cArray.length; i++){
//            System.out.println(cArray[i].PI);
//        }
    }
}
