import java.sql.SQLOutput;
import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        // Basamak Sayisi Bulma
        Scanner inp = new Scanner(System.in);

        int a, basamakToplam = 0, numberCounter = 0;

        System.out.print("Sayi Girin: ");
        a = inp.nextInt();

        while (a != 0){
            a = a/10;
            System.out.println(a);
            numberCounter++;
            basamakToplam += a;
        }
        System.out.println("Basamak Sayisi: " + numberCounter);
        System.out.println("Basamak Toplami: " + basamakToplam);

    }
}
