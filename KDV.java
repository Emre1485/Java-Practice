import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz:  ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: "+ tutar);
        System.out.println("KDV Orani: "+ kdvOran);
        System.out.println("KDV Tutari: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

    }
}
