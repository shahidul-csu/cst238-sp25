package wk02_mon;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Student s1 = new Student("abcd1234", "John Doe", 20);
        System.out.println(s1.getName());
        Student s2 = new Student("bcda2341", "Jane Done", 30);
        System.out.println(s2.getName());
        s2.setName("Jane Doe");
        System.out.println(s2.getName());

        int num1 = 5, num2 = 9;
        System.out.println("Result: " + add(num1, num2));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = in.next();
        readFile(filename);
    }

    public static void readFile(String filename) throws IOException{
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        int sum = 0;
        while (fs.hasNextInt()){
            int num = fs.nextInt();
            sum += num;
            System.out.println("Number: " + num);
            System.out.println("Number Square: " + (num * num));
        }
        System.out.println("Sum: " + sum);
        fs.close();
        fr.close();
    }

    public static int add(int a, int b){
        return a + b;
    }
}
