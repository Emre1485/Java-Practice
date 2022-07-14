import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayi, sayi2;

        System.out.println("!. Sayiyi Giriniz: ");
        sayi = inp.nextInt();

        System.out.println("2. Sayiyi Giriniz: ");
        sayi2 = inp.nextInt();

        int tempSayi = sayi, tempSayi2 = sayi2;
        while (sayi % sayi2 != 0 ){
            int gec = sayi % sayi2;
            sayi = sayi2;
            sayi2 = gec;
        }
        int ebob = (tempSayi * tempSayi2) / sayi2;

        System.out.println("EKOK: " + sayi2);
        System.out.println("EBOB: " + ebob);
    }
}
