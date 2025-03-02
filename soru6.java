
import java.util.ArrayList;
import java.util.Random;

public class soru6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random rand = new Random();

        // Add 20 random integers
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(100); // Random numbers between 0 and 99
            numbers.add(num);
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        // Print even numbers
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
