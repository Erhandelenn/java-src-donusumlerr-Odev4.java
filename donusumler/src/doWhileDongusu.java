import java.util.Random;
import java.util.Scanner;

public class doWhileDongusu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tahminHakki = 3;
        int tutulanSayi = random.nextInt();

        do {
            System.out.print("Sayı Tahmininiz: ");
            int tahmin = scanner.nextInt();
            if (tahmin == tutulanSayi) {
                System.out.println("Doğru bildiniz tutulan sayi:");
                break;
            }
            --tahminHakki;
            if (tahminHakki == 0) {
                System.out.println("Tahmin hakkınız kalmadı. Doğru sayı " + tutulanSayi + " idi.");
                break;
            }
            System.out.println("Bilemediniz. Kalan tahmin hakkınız: " + tahminHakki);
        } while(tahminHakki > 0);
        scanner.close();
    }
}
