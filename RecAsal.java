import java.util.Scanner;

public class RecAsal {
    static  void  Asal(int sayi){
        String asal = "";
        for (int i = 1; i <=sayi ; i++) {
            int sayac = 0;

            for (int j = i; j >= 1 ; j--) {
                if (i % j == 0){
                    sayac++;
                }
            }
            if (sayac == 2) {
                asal = asal + i + " ";
            }
        }
        System.out.println(asal + " Asaldir");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int n = input.nextInt();
        Asal(n);
    }
}
