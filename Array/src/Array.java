public class Array {
    public static void main(String[] args) {
        String[] isimler = {"Ali", "Ferman", "Doruk", "Vefa", "Nazlı"};

        int length = isimler.length;
        System.out.println("Array Uzunlugu: " + length);

        String firstElement = isimler[0];
        System.out.println("Birinci Eleman: " + firstElement);

        String lastElement = isimler[length - 1];
        System.out.println("Son Eleman: " + lastElement); // Çıktı: Last Element: Eve
    }
}