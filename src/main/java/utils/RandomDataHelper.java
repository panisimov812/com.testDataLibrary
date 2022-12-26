package utils;

import java.util.Random;

public class RandomDataHelper {
    static Random random = new Random();

    public static boolean returnEvenOrOddInteger() {
        int randomInteger = random.nextInt(2);
        return (randomInteger % 2 == 0);
    }

    public static int returnRandomIntFromRange(int startInt, int endInt) {
        return (int) (startInt + Math.random() * endInt);
    }

    public static String returnRandomValueFromArray(String[] value) {
        return value[(int) ((Math.random() * (value.length)))];
    }

    public static String returnRandomValueBetween(String[] firstArray, String[] secondArray) {
        if (returnEvenOrOddInteger()) {
            return (returnRandomValueFromArray(firstArray));
        } else {
            return (returnRandomValueFromArray(secondArray));
        }
    }

    public static String returnRandomValuesFrom(String[] firstArray, String[] secondArray) {
        return returnRandomValueFromArray(firstArray) + " " + returnRandomValueFromArray(secondArray);
    }

}
