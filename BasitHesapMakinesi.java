import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("birinci sayıyı giriniz: ");
        a = sc.nextInt();
        System.out.print("ikinci sayısı giriniz: ");
        b = sc.nextInt();
        System.out.print("Bu iki sayı ile hangi işlemi yapmak istiyorsunuz?");
        System.out.println("\n1-Toplama\n2-Cikarma\n3-carpma\n4-bolme");
        int c = sc.nextInt();
        switch(c){
            case 1:
                System.out.print("Toplam: "+(a+b));
                break;
            case 2:
                System.out.print("Fark: "+(a-b));
                break;
            case 3:
                System.out.print("Carpimlari: "+(a*b));
                break;
            case 4:
                System.out.println("Bolum"+(a/b));
                break;
            default:
                System.out.println("Belirtilen aralik icerisinden bir deger giriniz!!");
        }
    }
}
