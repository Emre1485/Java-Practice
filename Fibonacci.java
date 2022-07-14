import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i , sayi;
        
        Scanner inp = new Scanner(System.in);
        int a = 0, b = 1, c = 0;
        System.out.print("Bir Sayi Girin: ");
        sayi = inp.nextInt();

        for (i = 0; i <=sayi ; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        
    }
}
