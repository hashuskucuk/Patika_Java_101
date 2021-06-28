import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {


    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen Sayi : ");
        int sayi = sc.nextInt();
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < sayi &&  (sayi - i < 0 ? (sayi - i) * -1 : sayi -i ) < (sayi - min < 0 ? (sayi - min) * -1 : sayi -min )) {
                min = i;
            }
            if (i > sayi &&  (sayi - i < 0 ? (sayi - i) * -1 : sayi -i ) < (sayi - min < 0 ? (sayi - min) * -1 : sayi -min )) {
                max = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
