package wk08_wed;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    // Returns 0 if the current object is equal to the argument
    // Returns negative if the first item comes first
    // Returns positive if the first item comes second
    public int compareTo(Person p){
        if(this.age - p.age == 0){
            return this.name.compareTo(p.name);
        }
        return this.age - p.age;
//        return this.name.compareTo(p.name);
//        return p.heightInInches - this.heightInInches;
//        return this.age - p.age;

//        if(this.age == p.age){
//            return 0;
//        } else if(this.age < p.age){
//            return -1;
//        } else{
//            return 1;
//        }
    }

    public String toString(){
        return "Name: " + this.name + ", " +
                "Age: " + this.age + ", " +
                "Height " + this.heightInInches;

//        StringBuilder sb = new StringBuilder();
//        sb.append("Name: " + this.name + ", ");
//        sb.append("Age: " + this.age + ", ");
//        sb.append("Height: " + this.heightInInches + " ");
//        sb.toString();
    }
}
