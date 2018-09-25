import java.util.Scanner;

public class IfExample {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String  firstName = "Jaret";

        System.out.print("How comfortable are you with Java (1-5): ");
        int comfortLevel = keyboard.nextInt();

        //decide on which output to show
        if (comfortLevel >= 4)  //comfort level greater than or equal to 4
            System.out.println("Excellent - keep it up!");
        else if (comfortLevel == 3) //comfort level exactly equal to 3
            System.out.println("That is OK, but you probably want to experiment more");
        else //anything less than 3
            System.out.println("You will need to do more coding to get better");
    }
}
