import java.util.Scanner;
import java.util.Random;

public class whiledöngüsü {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tahminHakki = 3;
        int tutulanSayi = random.nextInt();
        int tahmin;

        while (tahminHakki > 0) {
            System.out.print("Sayı Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin == tutulanSayi) {
                System.out.println("Doğru bildiniz tutulan sayi:");
                break;
            } else {
                tahminHakki--;
                if (tahminHakki == 0) {
                    System.out.println("Tahmin hakkınız kalmadı. Doğru Sayı:" + tutulanSayi + " idi.");
                    break;
                } else {
                    System.out.println("Bilemediniz. Kalan tahmin hakkınız: " + tahminHakki);
                }
            }
        }

        scanner.close();
    }
}