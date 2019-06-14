import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args){
        String msg = "";
        int max = 3, sum = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter 3 numbers to add.");

        for (int i = 0; i < max; i++) {
            sum = sum + keyboard.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
