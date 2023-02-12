//Java Program for Lazy Instantiation

public class lazyClass {
    private static lazyClass instance;

    private lazyClass() {
    }

    public static synchronized lazyClass getInstance() {

        if (instance == null) {
            instance = new lazyClass();
        }

        return instance;
    }

    public void sampleMethod() {
        System.out.println("sampleMethod - Singleton Class in java");
    }

    public static void main(String[] args) {
        lazyClass cur = lazyClass.getInstance();
        cur.sampleMethod();
    }
}