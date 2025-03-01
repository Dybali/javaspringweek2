import java.util.Scanner;
public class TekrarBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç eleman gireceksiniz?: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Dizitarama(numbers);
        scanner.close();
    }

    public static void Dizitarama (int[] array) {
        System.out.print("Tekrar eden sayılar: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //ayni elamani buldugunda donguden cik
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}
