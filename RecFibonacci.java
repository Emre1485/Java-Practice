import  java.util.Scanner;


public class RecFibonacci {
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacci(num-2) + fibonacci(num-1);
    }


    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.println(maxNumber);
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }

}
