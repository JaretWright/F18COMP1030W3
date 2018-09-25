import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        //prompt user for 3 grades
        System.out.print("Enter the first grade: ");
        int grade1 = keyboard.nextInt();

        System.out.print("Enter the second grade: ");
        int grade2 = keyboard.nextInt();

        System.out.print("Enter the third grade: ");
        int grade3 = keyboard.nextInt();

        double avg = calculateAvg(grade1, grade2, grade3);
        System.out.printf("The average is %.1f%% %n", avg);
    }

    public static double calculateAvg(int n1, int n2, int n3)
    {
        return  (n1+n2+n3)/3.0;
    }
}
