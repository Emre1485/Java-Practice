import java.util.Scanner;

public class CiftveDortunKatlari {
    public static void main(String[] args) {
        int sayi = 0, toplam = 0, i = 0;
        boolean cond;
        Scanner inp = new Scanner(System.in);

        while (cond = true)
        {
            System.out.print(" Sayi Gir: ");
            sayi = inp.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0){
                toplam += sayi;
                System.out.println("Toplam: " + toplam);
            }
            else if (sayi % 2 != 0)
            {
                System.out.println("Toplam: " + toplam);
                System.out.println("Tek Sayi Girdiniz!");
                break;
            }
            else{
                System.out.println("Toplam: " + toplam);
            }

        }


    }
}
