package wk11_mon;

public class Exam2_Review_ComplexityAnalysis {
    public static void main(String[] args){

    }

    //Calculate Inner Loop T(n) = 4n + 2
    //Calculate total operations in loop = 2n + 2 + n * (4n + 2)
    //Total operations, T(n) = 4n^2 + 4n + 4 // Add the 2 operations outside loop
    //Calculate big O = O(n^2)
    public static int foo(int n){
        int res = 0; // 1
        for(int k = 0; k < n; k++) { // 1 + n + 1 + n
            for (int i = 0; i < n; i++) { // (1 + n + 1 + n) * n
                res = res + i; //(n + n) * n
            }
        }
        return res; // 1
    }

    //T(n) = 4n^3+ 7n + 4 => O(n^3)
    //T(n) = n^2 + nlogn + 4n + 7 => O(n^2)
    //T(n) = nlogn + 1000n + 500 => O(nlogn)
    //T(n) = 700 => O(1)
}
