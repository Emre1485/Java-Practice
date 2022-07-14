import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int num){
        int tempNum = num, reverseNum = 0, lastNum;
        while (tempNum !=0){
            lastNum =   tempNum % 10;
            reverseNum = (reverseNum * 10) * lastNum;
            tempNum /= 10;
        }
        if (num == reverseNum){
            System.out.println(num + " PalindromSayidir");
            return true;
        }
        else {
            System.out.println(num + " PalindromSayid Degildir");
            return false;
        }

    }
    public static void main(String[] args) {
    int number;
    Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number = inp.nextInt();
        isPalindrom(number);
    }
}
