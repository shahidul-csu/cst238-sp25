package wk07_mon;

public class Foo {
    private int bar;
    private String item;

    private static int fooCount = 0;

    public Foo(){
        this(12);
    }

    public Foo(int bar){
        this(bar, "Test");
    }

    public Foo(int bar, String item){
        this.setBar(bar);
        this.setItem(item);
        fooCount++;
    }

    public static int getFooCount(){
        return fooCount;
    }

    public int getBar(){
        return this.bar;
    }

    public void setBar(int bar){
        if(bar >= 0 && bar <= 100) {
            this.bar = bar;
        }
    }

    public String getItem(){
        return this.item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public void display(){
        System.out.println(bar + ", " + item);
    }
}
