package mid1.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        int randomRange1 = random.nextInt(10);
        System.out.println(randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println(randomRange2);
    }
}
