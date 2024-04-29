import java.util.Scanner;
import java.util.Random;

public class fordöngüsü
{ public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int tutulanSayi = random.nextInt();

            for (int i = 3; i > 0; i--) {
                System.out.print("Sayı tahmininiz: ");
                int tahmin = scanner.nextInt();

                if (tahmin == tutulanSayi) {
                    System.out.println(" Doğru bildiniz tutulan sayi: " + tutulanSayi);
                    break;
                } else {
                    if (i == 1) {
                        System.out.println("Tahmin hakkınız kalmadı. Doğru Sayı: " + tutulanSayi + " idi.");
                    } else {
                        System.out.println("Bilemediniz. Kalan tahmin hakkınız: " + (i - 1));
                    }
                }
            }
            scanner.close();
        }
    }
