package wk08_wed;

//Linear Search Complexity: O(N) : example, 2 billion operations
//Binary Search Complexity: O(logN) : example, 31 operations
//Sorting Algorithm Complexity: O(NLogN)
// 200 -> 100 -> 50 -> 25 -> 12 -> 6 -> 3 -> 2 -> 1
// log (2 Billion) = ~31

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<>();
        FileReader fr = new FileReader("src/wk08_wed/data.txt");
        Scanner fin = new Scanner(fr);
        while(fin.hasNext()){
            al.add(fin.next());
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        fr.close();

        System.out.println("Apple".compareTo("Apple"));
        System.out.println("Apple".compareTo("Orange"));
        System.out.println("Orange".compareTo("Grapes"));
        System.out.println("Orange".compareTo("Only"));

        ArrayList<Person> people = loadPersonFromFile("src/wk08_wed/person.txt");
        printArrayList(people);
        System.out.println();
        Collections.sort(people);
        printArrayList(people);
    }

    public static void printArrayList(ArrayList<Person> al){
        for(Person p : al){
            System.out.println(p);
        }
    }

    public static ArrayList<Person> loadPersonFromFile(String fileName) throws IOException{
        ArrayList<Person> people = new ArrayList<>();
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);

        while(fin.hasNext()){
            Person p = new Person(fin.next(), fin.nextInt(), fin.nextInt());
            people.add(p);
        }

        fr.close();
        return people;
    }
}
