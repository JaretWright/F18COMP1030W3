import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();

        if (number < 10)
            System.out.print("That is a small number");
        else
            System.out.println("Nice number");
    }
}
