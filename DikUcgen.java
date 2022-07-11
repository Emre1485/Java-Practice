import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double Hipotenus;

        Scanner kenarGirdi = new Scanner(System.in);
        System.out.print("1.Kenari Gir: ");
        kenar1 = kenarGirdi.nextInt();

        System.out.print("2.Kenari Gir: ");
        kenar2 = kenarGirdi.nextInt();

        Hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenus: " + Hipotenus);
    }
}
