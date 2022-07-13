import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam =0, alinanSayi;
        System.out.print("Bir sayi giriniz: ");
        alinanSayi = inp.nextInt();

        for (int i = 1; i <=alinanSayi ; i++) {
            for (int j = 1; j < i; j++) {
                if (i% j ==0){
                    toplam = toplam + j;
                }
            }
            if (toplam ==i){
                System.out.println(i + " Mukemmel Sayidir");
            }
            toplam =0;
        }
    }
}
