import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        int kilo;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kac Kilo Elma Almak Istesin? ");
        kilo = inp.nextInt();
        elma = elma * kilo;

        System.out.print("Kac Kilo Armut Almak Istersiniz? ");
        kilo = inp.nextInt();
        armut = armut*kilo;

        System.out.print("Kac Kilo Domates Almak Istersiniz? ");
        kilo = inp.nextInt();
        domates = domates*kilo;

        System.out.print("Kac Kilo Muz Almak Istersiniz? ");
        kilo = inp.nextInt();
        muz = muz*kilo;

        System.out.print("Kac Kilo Patlican Almak Istersiniz? ");
        kilo = inp.nextInt();
        patlican = patlican*kilo;

        toplam = elma + armut + domates + muz + patlican;
        System.out.print("Toplam Tutar: " + toplam);
    }
}
