import java.util.ArrayList;
import java.util.Scanner;

    public class soru5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> kelimeler = new ArrayList<>(); // Kelimeleri saklamak için ArrayList

            // Kullanıcıdan 10 kelime alıyoruz
            for (int i = 0; i < 10; i++) {
                System.out.print("Lütfen " + (i + 1) + ". kelimeyi girin: ");
                String kelime = scanner.nextLine(); // Kullanıcının girdiği kelimeyi alıyoruz
                kelimeler.add(kelime); // Kelimeyi ArrayList'e ekliyoruz
            }

            // Kelimeleri ASCII değerlerine göre sıralıyoruz
            asciiyeGoreSiralama(kelimeler);

            // Sıralanmış kelimeleri ekrana yazdırıyoruz
            System.out.println("ASCII değerlerine göre sıralanmış kelimeler:");
            for (String kelime : kelimeler) {
                System.out.println(kelime);
            }

            scanner.close(); // Scanner'ı kapatıyoruz
        }

        // ASCII değerlerine göre sıralama yapan metot
        public static void asciiyeGoreSiralama(ArrayList<String> kelimeler) {
            for (int i = 0; i < kelimeler.size() - 1; i++) {
                for (int j = i + 1; j < kelimeler.size(); j++) {
                    // İki kelimenin ASCII değerlerine göre karşılaştırılması
                    if (kelimeler.get(i).compareTo(kelimeler.get(j)) > 0) {
                        // Kelimelerin yerlerini değiştiriyoruz
                        String temp = kelimeler.get(i);
                        kelimeler.set(i, kelimeler.get(j));
                        kelimeler.set(j, temp);
                    }
                }
            }
        }
    }