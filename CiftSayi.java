import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        int girilenSayi, toplam = 0, i;
        double ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        girilenSayi = inp.nextInt();

        for (i = 0; i < girilenSayi ; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                toplam += i;
                System.out.println(i);
            }

        }
        System.out.print("Toplam: " + toplam);
    }
}
