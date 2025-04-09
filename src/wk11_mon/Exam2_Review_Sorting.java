package wk11_mon;

import java.util.Arrays;

public class Exam2_Review_Sorting {
    public static void main(String[] args){
        Integer[] numbers = {7, 2, 3, 6};
        print(numbers);
        Arrays.sort(numbers);
        print(numbers);

        String[] fruits = {"Orange", "Mango", "Apples", "Kiwi"};
        print(fruits);
        Arrays.sort(fruits);
        print(fruits);

        Foo[] fa = new Foo[4];
        fa[0] = new Foo(7, "Orange");
        fa[1] = new Foo(2, "Mango");
        fa[2] = new Foo(3, "Apples");
        fa[3] = new Foo(6, "Kiwi");
        print(fa);
        Arrays.sort(fa);
        print(fa);
    }

    public static <T> void print(T[] array){
        for(T n : array){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

class Foo implements Comparable<Foo>{
    int num;
    String fruit;
    public Foo(int num, String fruit){
        this.num = num;
        this.fruit = fruit;
    }

    public int compareTo(Foo other){
        return this.fruit.compareTo(other.fruit);
//        return this.num - other.num;
    }

    //Override
    public String toString() {
        return "[" + this.num + "," + this.fruit + "]";
    }
}
