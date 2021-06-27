import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N Adedini Girin: ");
        int n = sc.nextInt();
        int maks = 0;
        int min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int sayi = sc.nextInt();

            if (i == 1) {
                maks = sayi;
                min = sayi;
            }

            if (sayi > maks) {
                maks = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En Büyük Sayı: " + maks);
        System.out.println("En Küçük Sayı: " + min);
    }
}
