import java.util.ArrayList;
import java.util.Scanner;

public class soru7{
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");
        cities.add("Bursa");
        cities.add("Antalya");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city: ");
        String inputCity = scanner.nextLine();

        int index = cities.indexOf(inputCity);
        if (index != -1) {
            System.out.println("City found at index: " + index);
        } else {
            System.out.println("City not found.");
        }
    }
}