package utils.helpers;


import org.apache.commons.lang3.ArrayUtils;


import java.util.Random;

public class RandomDataHelper {
    static Random random = new Random();

    public static boolean returnEvenOrOddInteger() {
        int randomInteger = random.nextInt(2);
        return (randomInteger % 2 == 0);
    }

    public static int getRandomIntFromRange(int startInt, int endInt) {
        return (int) (startInt + Math.random() * endInt);
    }

    public static String getRandomValueFromArray(String[] value) {
        return value[(int) ((Math.random() * (value.length)))];
    }

    public static String returnRandomValuesFrom(String[] firstArray, String[] secondArray) {
        return getRandomValueFromArray(firstArray) + " " + getRandomValueFromArray(secondArray);
    }

}
