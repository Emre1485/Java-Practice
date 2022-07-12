import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int r,k, toplam = 1, i = 1;

        boolean cond = true;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayiyi Gir: ");
        r = inp.nextInt();
        System.out.print("Uss Olacak Sayiyi Gir: ");
        k = inp.nextInt();
        for (i = 1; i <= k ; i++)
        {
            toplam = toplam * r;
        }
        System.out.println("Sonuc = " + toplam);





    }
}
