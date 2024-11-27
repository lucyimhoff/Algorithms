

public class Main{
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = Algorithms.odds();
        //int evens = evens();
        System.out.println(odds);
        s.close();
    }
}