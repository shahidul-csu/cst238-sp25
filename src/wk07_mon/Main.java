package wk07_mon;

public class Main {
    public static void main(String[] args){
        System.out.println("Object count: " + Foo.getFooCount());
        Foo f1 = new Foo();
        System.out.println(f1);
        System.out.println(f1.getMe());
        System.out.println("Object count: " + Foo.getFooCount());
        f1.display();
        System.out.println();
        Foo f2 = new Foo(5, "Update 1");
//        System.out.println(f2);
        System.out.println("Object count: " + Foo.getFooCount());
//        f2.display();
        System.out.println();
        int n = 7;
        System.out.print("Before method call:");
        System.out.println(n);
        System.out.println(f2.getItem());
        update(f2, n);
        System.out.println("After method call:");
        System.out.println(n);
        System.out.println(f2.getItem());
    }

    public static void update(Foo f, int a){
        f.setItem("New Update");
        a = 13;
        System.out.println("In the method call:");
        System.out.println(a);
        System.out.println(f.getItem());
    }
}
