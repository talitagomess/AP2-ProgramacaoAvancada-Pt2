public class TestaIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // IncrementalSingleton inc = new IncrementalSingleton();
            IncrementalSingleton incSing = IncrementalSingleton.getInstance();
            Incremental inc = new Incremental();

            System.out.println(inc.toString());
            System.out.println(incSing.toString());
        }
    }
}