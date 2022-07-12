import java.util.Scanner;

public class GirilenSayi {
    public static void main(String[] args) {
        int girilenSayi, i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        girilenSayi = inp.nextInt();

        for (i = 1 ; i <= girilenSayi ; i++){
            while (i % 4 == 0 || i % 5 == 0){
                System.out.println("4 veya 5 Katsayılari: " + i);
                break;
            }
        }
    }
}
