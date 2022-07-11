import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int num1, num2, select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = inp.nextInt();

        System.out.print("Enter second number: ");
        num2 = inp.nextInt();

        System.out.println("1- Add\n2- Minus\n3- Divide\n4- Multiplication");
        System.out.print("Select: ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 / num2);
                break;
            case 4:
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Wrong input!");
        }

    }
}
