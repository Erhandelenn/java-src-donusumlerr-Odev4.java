import java.util.Scanner;
import java.util.Random;

public class ifdöngüsü
{ public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir rakam giriniz: ");
        int rakam = scanner.nextInt();

        if (rakam == 1) {
            System.out.println("Pazartesi");
        } else if (rakam == 2) {
            System.out.println("Salı");
        } else if (rakam == 3) {
            System.out.println("Çarşamba");
        } else if (rakam == 4) {
            System.out.println("Perşembe");
        } else if (rakam == 5) {
            System.out.println("Cuma");
        } else if (rakam == 6) {
            System.out.println("Cumartesi");
        } else if (rakam == 7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Hatalı rakam. 1 ile 7 arasında bir rakam giriniz.");
        }
        scanner.close();
    }
}