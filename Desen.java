import java.util.Scanner;

public class Desen {
    static void desenAzalt(int sayi){
        for (int i = sayi; i >= 0 ; i = i - 5) {
            System.out.print(i + " ");
        }
    }

    static void desenEkle(int n){
        for(int i=0; i<=n ; i = i + 5){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = inp.nextInt();
        System.out.println("Azalt");
        desenAzalt(n);

        System.out.println("\nArttir");

        desenEkle(n);
    }
}
