package wk02_wed;

public class Coffee {
    private int sizeInOunces;
    private String[] syrups;
    private int syrupCount;
    public static final int MIN_SYRUP = 2;
    public static final int MAX_SYRUP = 5;

    public Coffee(){
        System.out.println("Constructor 1 is called");
        sizeInOunces = 12;
        syrups = new String[MIN_SYRUP];
        syrupCount = 0;
    }

    public Coffee(int size){
        System.out.println("Constructor 2 is called");
        sizeInOunces = size;
        if(size > 18){
            syrups = new String[MAX_SYRUP];
        } else{
            syrups = new String[MIN_SYRUP];
        }
        syrupCount = 0;
    }

    public void addSyrup(String flavor){
        if(syrupCount < syrups.length){
            syrups[syrupCount++] = flavor;
        } else{
            System.out.println("Too many syrups");
        }
    }

    public String toString(){
        if(syrupCount == 0){
            return "No Syrups";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < syrupCount; i++){
                sb.append(syrups[i]).append(",");
            }
            return sb.toString();
        }
    }
}
