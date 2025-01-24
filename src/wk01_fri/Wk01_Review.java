package wk01_fri;

import java.util.Random;
import java.util.Scanner;

public class Wk01_Review {
    public static void main(String[] args){
//        System.out.println("Hello CST238");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int range = 10;
        int offset = 1;
        int secret = Math.abs(rand.nextInt()) % range + offset;
        int limit = 4;
        int[] guesses = new int[limit];
        int count = 0;
        do{
            System.out.print("Enter your guess: ");
//            guesses[count++] = in.nextInt();
            int guess = in.nextInt();
            guesses[count] = guess;
            count++;
            if(guess == secret){
                System.out.println("Congratulation! You guessed in correctly!");
                break;
            } else{
                System.out.println("Your guess is incorrect! Try again!");
                System.out.println("You have " + (limit - count) + " guess(es) left");
            }
        }while(count < limit);
        System.out.println("Secret: " + secret);
        System.out.print("Your guesses: ");
        for(int i = 0; i < count; i++){
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }
}
