
import java.util.Scanner;

public class Diziort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];
        int toplam = 0;

        // Kullanıcıdan 10 adet tam sayı
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Lütfen " + (i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
            toplam += sayilar[i];
        }

        // Dizinin ortalamasını hesaplama
        double ortalama = (double) toplam / sayilar.length;
        System.out.println("Dizinin ortalaması: " + ortalama);

        // 50'den büyük olan elemanları listeleme
        System.out.println("50'den büyük olan elemanlar:");
        for (int sayi : sayilar) {
            if (sayi > 50) {
                System.out.println(sayi);
            }
        }

        scanner.close();
    }
}