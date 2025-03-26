package wk10_wed;

import java.util.Scanner;

public class MoreRecursion {
    public static void main(String[] args){
        int[] data = {5, 1, 7, 4, 2};
        System.out.println(sumOfArray(data, 0));

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if(num1 == 0 && num2 == 0){
                System.out.println("GCD Undefined");
                break;
            }
            int gcdRes = gcd(num1, num2);
            System.out.println("GCD(" + num1 + "," + num2 + ") = " + gcdRes);
        }
    }

    //sum(data, start) = data[start] + sum(data, start + 1)
    public static int sumOfArray(int[] data, int start){
        if(start == data.length - 1){
            return data[start];
        }
        return data[start] + sumOfArray(data, start + 1);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
