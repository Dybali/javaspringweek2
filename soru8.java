
import java.util.ArrayList;
import java.util.Collections;

public class soru8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add 10 numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);
        numbers.add(25);
        numbers.add(0);
        numbers.add(35);
        numbers.add(40);
        numbers.add(50);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}