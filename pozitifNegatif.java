import java.util.Scanner;

public class pozitifNegatif{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç eleman gireceksiniz?: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        toplam(numbers);
        scanner.close();
    }

    public static void toplam(int[] array) {
        int positiveSum = 0;
        int negativeSum = 0;

        for (int num : array) {
            if (num > 0) {
                positiveSum += num;
            } else if (num < 0) {
                negativeSum += num;
            }
        }

        System.out.println("Pozitif sayıların toplamı: " + positiveSum);
        System.out.println("Negatif sayıların toplamı: " + negativeSum);
    }
}
