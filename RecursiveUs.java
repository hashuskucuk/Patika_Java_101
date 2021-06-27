import java.util.Scanner;

public class RecursiveUs {
    public static int us(int taban, int usDeger) {
        if (usDeger == 0) {
            return 1;
        } else if (taban == 1) {
            return 1;
        } else {
            return taban * us(taban, usDeger - 1);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        int usDeger = sc.nextInt();

        System.out.println("Sonuç = " + us(taban, usDeger));

    }
}
