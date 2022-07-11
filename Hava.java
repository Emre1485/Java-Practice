import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        int sicaklik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sicakligi giriniz: ");
        sicaklik = inp.nextInt();

        if (sicaklik <5) {
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }
        else if (sicaklik >=5 && sicaklik<15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
        else if (sicaklik >=15 && sicaklik <25) {
            System.out.println("Piknige Gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
