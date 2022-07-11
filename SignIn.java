import javax.swing.*;
import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Your UserName: ");
        userName = input.nextLine();

        System.out.print("Your Password");
        password = input.nextLine();

        if (userName.equals("Emre") && password.equals("123")){
            System.out.print("Welcome " + userName);
        }
        else {
            System.out.print("Wrong Username or Password!");
        }
    }
}
