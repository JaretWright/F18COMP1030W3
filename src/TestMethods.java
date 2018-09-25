public class TestMethods {

    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
            System.out.printf("A random number is %d%n", MethodExamples.getRandomNumber());

        int volume = MethodExamples.getRandomNumber();
        MethodExamples.getToluToYellInHall("Break time", volume);

        MethodExamples.getToluToYellInHall("Break time", MethodExamples.getRandomNumber());

        MethodExamples.getToluToYellInHall("Break time", 10);

    }
}
