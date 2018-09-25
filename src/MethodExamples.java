import java.security.SecureRandom;

public class MethodExamples
{
    //This is a "global" variable, we can access it anywhere inside the class
    //It is only recommended to use Global variables if they are attributes of a class (i.e.
    //instance variables.
    static String myName;

    /**
     * This is a method definition that accepts 2 arguments, a String called "phraseToYell"
     * and an int called "volume"
     * @param phraseToYell - what Tolu will say in the hal
     * @param volume - how loud he will yell it
     */
    public static void getToluToYellInHall(String phraseToYell, int volume)
    {
        myName = "Jaret";
        System.out.printf("Yelling: '%s' at volume %d%n", phraseToYell, volume);
    }


    /**
     * This is a method with no arguments.
     * @return a random number between 1-10
     */
    public static int getRandomNumber()
    {
        //myName="Josh";

        //class      variable name     constructor
        SecureRandom rng               = new SecureRandom();
        return rng.nextInt(10)+1;
    }
}
