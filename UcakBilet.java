import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {

        int yas,tip;
        double mesafe, normalTutar, yasIndirimi,indirimliTutar, gdbIndirimi, toplamTutar, yasIndirimOrani;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz: ");
        mesafe = inp.nextDouble();

        System.out.print("Yasinizi Giriniz: ");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipini Seciniz: ");
        tip = inp.nextInt();

        if (yas < 12){
            yasIndirimOrani = 0.5;
        }
        else if (yas >=12 && yas < 24){
            yasIndirimOrani = 0.10;
        }
        else if (yas >=24 && yas <=65){
            yasIndirimOrani =0;
        }
        else if (yas > 65){
            yasIndirimOrani = 0.3;
        }
        else {
            yasIndirimOrani = 1;
            System.out.println("HATALI YAS GIRDINIZ!");
        }

        normalTutar = mesafe * 0.10;
        yasIndirimi = normalTutar * yasIndirimOrani;
        indirimliTutar = normalTutar - yasIndirimi;

        if (tip ==2){
            gdbIndirimi = indirimliTutar * 0.20;
        }
        else if (tip == 1){
            gdbIndirimi = indirimliTutar * 0;
        }
        else {
            gdbIndirimi = indirimliTutar * 0;
            System.out.println(" Yanlis Tip Degerini Girdiniz (1 veya 2 girebilirsiniz)");
        }

        toplamTutar =  (indirimliTutar - gdbIndirimi) * tip;

        System.out.println("Normal Tutar: " + normalTutar);
        System.out.println("Yas Indirimi: " + yasIndirimi);
        System.out.println("Indirimli Tutar: " + indirimliTutar);
        System.out.println("Gidis Donus Bilet Indirimi: " + gdbIndirimi);
        System.out.println("Toplam Tutar: " + toplamTutar);

    }
}
