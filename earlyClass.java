
//Java Program for Early Instantiation
// Private Class
public class earlyClass {
    private static earlyClass instance = new earlyClass();
    //Private Constructor
    private earlyClass() {
    }

    //Returns the instance
    public static earlyClass getInstance() {
        return instance;
    }

    public void sampleMethod() {
        System.out.println("sampleMethod - Early Singleton Class in java");
    }

    public static void main(String[] args) {
        earlyClass cur = earlyClass.getInstance();
        cur.sampleMethod();
    }
}