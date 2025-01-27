package wk02_mon;

public class Student {
    private String id;
    private String name;
    private int credit;

    Student(String i, String n, int c){
        id = i;
        name = n;
        credit = c;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}
