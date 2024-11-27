import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigits();
        int aboveFiveHundred = aboveFiveHundred();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double average = average();
        int mode = mode();
        System.out.println("odds: " + odds);
        System.out.println("evens: " + evens);
        System.out.println("two digits: " + twoDigits);
        System.out.println("above five hundred: " + aboveFiveHundred);
        System.out.println("greatest number: " + greatest);
        System.out.println("least number: " + least);
        System.out.println("sum:  " + sum);
        System.out.println("average: " + average);
        System.out.println("mode: " + mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }


    public static int twoDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        while (s.hasNext()) {
            if (s.nextInt() / 10 >= 0 && s.nextInt() < 10)
                twoDigits++;
        }
        return twoDigits;
    }

    public static int aboveFiveHundred() throws FileNotFoundException{
        s = new Scanner(f);
        int aboveFiveHundred = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
            aboveFiveHundred++;
        }
        return aboveFiveHundred;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = s.nextInt();
        while (s.hasNext()) {
            int current = s.nextInt();
            if(current > greatest)
            greatest = current;
            
            
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = s.nextInt();
        while (s.hasNext()) {
            int current = s.nextInt();
            if(current < least)
            least = current;
            
            
        }
        return least;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            int current = s.nextInt();
            sum = sum + current;
            
            
        }
        return sum;
    }

    public static double average() throws FileNotFoundException{
        s = new Scanner(f);
        double average = 0;
        double sum = 0;
        int lineCount = 0;
        while (s.hasNext()) {
            double current = s.nextInt();
            sum = sum + current;
            lineCount++;

            
            
            
        }
        average = sum/lineCount;
        return average;
    }

    
    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        int mode = 0;
        int[] nums;
        while (s.hasNext()) {

            

            
            
            
        }
        return mode;
    }

}