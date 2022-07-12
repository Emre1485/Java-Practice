import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int month, day;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dogdugunuz Ay: ");
        month  = inp.nextInt();

        System.out.print("Dogdugunuz Gun: ");
        day = inp.nextInt();

        switch (month){
            case 1:
                if (day >= 1 && day <=31){
                    if (day < 22){
                        System.out.println("Oglak Burcu");
                    }
                    else {
                        System.out.println("Kova Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;

            case 2:
                if (day >= 1 && day <= 28){
                    if (day < 20){
                        System.out.println("Kova Burcu");
                    }
                    else {
                        System.out.println("Balik Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 3:
                if (day >= 1 && day <=31){
                    if (day <21){
                        System.out.println("Balik Burcu");
                    }
                    else {
                        System.out.println("Koc Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 4:
                if (day >=1 && day <=30){
                    if (day <21){
                        System.out.println("Koc Burcu");
                    }
                    else {
                        System.out.println("Boga Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 5:
                if (day >=1 && day <=31){
                    if (day <22){
                        System.out.println("Boga Burcu");
                    }
                    else {
                        System.out.println("Ikizler Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 6:
                if (day >=1 && day <=30){
                    if (day <23){
                        System.out.println("Ikizler Burcu");
                    }
                    else {
                        System.out.println("Yengec Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 7:
                if (day >=1 && day <=31){
                    if (day <23){
                        System.out.println("Yengec Burcu");
                    }
                    else {
                        System.out.println("Aslan Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 8:
                if (day >=1 && day <=30){
                    if (day < 23){
                        System.out.println("Aslan Burcu");
                    }
                    else {
                        System.out.println("Basak Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 9:
                if (day >=1 && day <=31){
                    if (day < 23){
                        System.out.println("Aslan Burcu");
                    }
                    else {
                        System.out.println("Basak Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 10:
                if (day >=1 && day <=30){
                    if (day <23){
                        System.out.println("Basak Burcu");
                    }
                    else {
                        System.out.println("Terazi Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;
            case 11:
                if (day >=1 && day <=31){
                    if (day <23){
                        System.out.println("Terazi Burcu");
                    }
                    else {
                        System.out.println("Akrep Burcu");
                    }
                }
                else {
                    System.out.println("Gecersiz Tarih Girdiniz!");
                }
                break;

    }
}
}
