import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        double kilo, boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilonuz: ");
        kilo = inp.nextDouble();

        double vKindeksi = kilo / (boy * boy);

        System.out.println("Kilonuz: " + kilo);
        System.out.println("Boyunuz: " + boy);
        System.out.println("Vucut Kutle Indeksiniz: " + vKindeksi);
    }
}
