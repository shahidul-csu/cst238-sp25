package wk11_mon;

public class Exam2_Review_Recursion {
    public static void main(String[] args){
//        System.out.println(recursionTrace(4, 4));
        System.out.println(recursionTrace2(1, 1));
    }

    public static int recursionTrace2(int a, int b){
        if(b >= 4){
            return 4;
        }
        System.out.println(a + ", " + b);
        int res = recursionTrace2(a, b + 1);
        System.out.println(a + ", " + b + ", " + res);
        return a + b + res;
    }

    //recursionTrace(0, 6) // return 0
    //recursionTrace(2, 5) // return 7
    //recursionTrace(4, 4) //
    
    //Print
    //4,4
    //2,5
    //2,5,0
    //4,4,7
    //15
    public static int recursionTrace(int a, int b){
        if(a <= 0){
            return 0;
        }
        System.out.println(a + "," + b);
        int res = recursionTrace(a - 2, b + 1);
        System.out.println("[" + a + "," + b + "," + res + "]");
        return a + b + res;
    }
}
