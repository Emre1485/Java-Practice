import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        int tr, mat, fiz, kim, muz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Turkce Notunuz: ");
        tr = inp.nextInt();

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim = inp.nextInt();

        System.out.print("Muzik Notunuz: ");
        muz = inp.nextInt();

        double ortalama = (tr+ mat + fiz + kim + muz)/5;

        if (ortalama >= 50){
            System.out.println("Tebrikler gectiniz!\nOrtalamaniz: " + ortalama);
        }
        else {
            System.out.println("Kaldiniz!\nOrtalamaniz: " + ortalama);
        }

    }
}
