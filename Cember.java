import java.util.Scanner;

public class Cember {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz: ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alani: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);
    }
}
