import java.util.Scanner;

public class Mukemmel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı Girin: ");
        int sayi = sc.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Mükemmel Sayıdır");
        } else {
            System.out.println(sayi + " Mükemmel Sayı Değildir");
        }
    }

}
