package wk02_wed;

public class CoffeeTest {
    public static void main(String[] args){
        Coffee c1 = new Coffee();
        System.out.println(c1);
        System.out.println(c1.MIN_SYRUP);
        c1.addSyrup("vanilla");
        c1.addSyrup("caramel");
        c1.addSyrup("liquid sugar");
        System.out.println(c1);
        Coffee c2 = new Coffee(20);
        c2.addSyrup("vanilla");
        c2.addSyrup("caramel");
        c2.addSyrup("liquid sugar");
        System.out.println(c2);
    }
}
