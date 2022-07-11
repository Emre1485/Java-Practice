import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        int tr,mat,fen;
        System.out.print("Turkce Notunuzu Giriniz: ");
        Scanner inp = new Scanner(System.in);
        tr = inp.nextInt();

        System.out.println("Mat notunu gir: ");
        mat = inp.nextInt();

        System.out.println("Fen notunu gir");
        fen = inp.nextInt();

        int ortalama = (mat + tr + fen)/3;
        System.out.println("Ortalama: " + ortalama);

        if (ortalama >= 50)
            System.out.print("Geçtiniz!");
        else
            System.out.print("Kaldinizz!");

    }
}
