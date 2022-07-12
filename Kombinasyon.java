import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,ntoplam = 1, rtoplam = 1, toplam = 1, i, sonuc;

        Scanner inp = new Scanner(System.in);
        System.out.print("N Eleman Sayisini Gir: ");
        n = inp.nextInt();

        System.out.print("R li kombinasyon");
        r = inp.nextInt();

        for (i = 1; i <= n ; i++){
            ntoplam = ntoplam * i;
        }
        for (i = 1; i <= r ; i++ ){
            rtoplam = rtoplam * i;
        }
        for (i = 1; i <= (n - r) ; i++){
            toplam = toplam * i;
        }
        sonuc = ntoplam/(rtoplam * toplam);

        System.out.println(n + "'in " + r +"'li Kombinasyonu : " + sonuc);
    }
}
