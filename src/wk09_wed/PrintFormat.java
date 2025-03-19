package wk09_wed;

public class PrintFormat {
    public static void main(String[] args){
        double pi = 3.14159;
        double rando = 3542.71695;

        //%f [float] %d [int], %s [String]
        System.out.printf("[%f] [%f] \n", pi, rando);
        System.out.printf("[%.2f] [%.2f] %n", pi, rando);
        System.out.printf("[%20f] [%20f] %n", pi, rando);
        System.out.printf("[%-20f] [%-20f] %n", pi, rando);
        System.out.printf("[%-20.4f] [%-20.4f] %n", pi, rando);

        int num = 52;
        System.out.printf("[%d] [%7d] [%07d] %n", num, num, num);
        String text = String.format("[%d] [%7d] [%07d] %n", num, num, num);
        System.out.println(text);
    }
}
