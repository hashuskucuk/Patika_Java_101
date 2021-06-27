import java.util.Scanner;

public class DiziSırala {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = sc.nextInt();
        int[] dizi = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            dizi[i] = sc.nextInt();
        }
        int tmp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[i]) {
                    tmp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = tmp;
                }
            }
        }
        System.out.print("Sıralama : ");
        for(int i : dizi){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
