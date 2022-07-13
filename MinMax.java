import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, girilenSayi, tempSayi = 0, max = 1, min = 1;
        System.out.print("Kac Sayi Gireceksiniz: ");
        sayi = inp.nextInt();
        for (int i = 1; i <=sayi ; i++){
            System.out.print("Sayi Giriniz: ");
            girilenSayi = inp.nextInt();
            if (i == 1){
                max = girilenSayi;
                min = girilenSayi;
            }

            if (girilenSayi > max){
                max = girilenSayi;
            }

            if (girilenSayi < min){
                min = girilenSayi;
            }
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

    }
}
