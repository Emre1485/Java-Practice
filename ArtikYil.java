import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yil;
        boolean artikYilMi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Yil Giriniz: ");
        yil = inp.nextInt();

        if (yil % 4 == 0)
        {
            if (yil % 100 == 0)
            {
               if (yil % 400 == 0)
               {
                   artikYilMi = true;
               }
               else
               {
                   artikYilMi = false;
               }
            }
            else
            {
                artikYilMi = true;
            }
        }
        else
        {
            artikYilMi = false;
        }
        if (artikYilMi)
        {
            System.out.println("Girdiginiz Yil Arik Yildir!");
        }
        else
        {
            System.out.println("Girdiginiz Yil Artik Yil Degildir!");
        }
    }
}
