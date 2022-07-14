import java.util.Scanner;

public class TersUcgen{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int  basamak;
        System.out.println("Basamak Giriniz: ");
        basamak = inp.nextInt();




        for(int i = basamak; i >= 1; i--)
        {

            for(int j = i; j < basamak; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}