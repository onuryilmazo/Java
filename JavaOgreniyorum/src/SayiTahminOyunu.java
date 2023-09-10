import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxTahminSayisi = 10; // Oyuncunun maksimum tahmin sayısı
        int rastgeleSayiAraligi = 100; // Rastgele seçilen sayının aralığı (0 ile rastgeleSayiAraligi arasında)

        int rastgeleSayi = random.nextInt(rastgeleSayiAraligi + 1);
        int tahmin;
        int tahminSayisi = 0;
        boolean tahminDogru = false;

        System.out.println("1 ile " + rastgeleSayiAraligi + " arasında bir sayı tahmin edin.");

        while (tahminSayisi < maxTahminSayisi) {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı deneyin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı deneyin.");
            } else {
                tahminDogru = true;
                break;
            }
        }

        if (tahminDogru) {
            System.out.println("Tebrikler! " + rastgeleSayi + " sayısını " + tahminSayisi + " tahminde buldunuz.");
        } else {
            System.out.println("Üzgünüm, tahmin hakkınız tükendi. Doğru cevap: " + rastgeleSayi);
        }

        scanner.close();
    }
}
