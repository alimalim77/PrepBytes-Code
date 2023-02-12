//Java Program for Lazy Instantiation
// Private Class
public class lazyClass {
    private static lazyClass instance;
    //Private Constructor
    private lazyClass() {
    }

    //Returns the instance
    public static synchronized lazyClass getInstance() {

        if (instance == null) {
            instance = new lazyClass();
        }

        return instance;
    }

    public void sampleMethod() {
        System.out.println("sampleMethod - Lazy Singleton Class in java");
    }

    public static void main(String[] args) {
        lazyClass cur = lazyClass.getInstance();
        cur.sampleMethod();
    }
}