public class IncrementalSingleton {

    private static int count = 0;
    private int numero;

    private static IncrementalSingleton INSTANCE;

    private IncrementalSingleton() {
        this.numero = ++IncrementalSingleton.count;
    }

    public static IncrementalSingleton getInstance() {
       if (INSTANCE == null) {
           INSTANCE = new IncrementalSingleton();
       }
       return INSTANCE;
   }

    public String toString() {
        return "incrementalSingleton: " + this.numero;
    }

}
