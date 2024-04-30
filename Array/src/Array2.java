public class Array2 {
    public static void main(String[] args) {
        // Örnek bir string oluşturma
        String text = "Ali,Veli,Ayşe,Fatma,Kemal";

        // String'i "," karakterlerine göre bölmek ve diziye dönüştürmek
        String[] parts = text.split(",");

        // Dizinin uzunluğunu ekrana yazdırma
        int length = parts.length;
        System.out.println("Array Length: " + length); // Çıktı: Array Length: 5

        // Tüm bölünen değerleri ekrana yazdırma
        System.out.println("Array Elements:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}