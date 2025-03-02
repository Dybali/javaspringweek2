import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted Numbers (Descending): " + numbers);
    }
}