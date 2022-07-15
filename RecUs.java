import java.util.Scanner;

public class RecUs {
    static int total = 1;
    static int us(int x, int y){
        if (x == 0){
            return 1;
        }

        total *= y;
        us(x-1,y);
        return total;
    }

    public static void main(String[] args) {
        int usS, tabanS;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban: ");
        tabanS = input.nextInt();

        System.out.print("Us: ");
        usS = input.nextInt();

        System.out.println(us(usS,tabanS));
    }
}
