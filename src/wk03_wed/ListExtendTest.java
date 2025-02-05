package wk03_wed;

public class ListExtendTest {
    public static void main(String[] args){
        ListExtend alist1 = new ListExtend();
        System.out.println(alist1);
        ListExtend pets = new ListExtend(100);
        pets.append("Dog");
        pets.append("Cat");
        System.out.println(pets);
        pets.append("Bird");
        pets.append("Fish");
        pets.append("Hamster");
        pets.append("Snake");
        System.out.println(pets);
        System.out.println("Total characters: " + pets.countChar());
        System.out.println("First letter: " + pets.firstLetter());
        System.out.println(pets.get(1));
        System.out.println(pets.get(-7));
        System.out.println(pets.get(1001));
    }
}
