package utils.helpers;

import static utils.helpers.DataHelper.*;
import static utils.helpers.DataHelper.getRandomFemaleRusName;

public class RandomValuesHelpers {

    public static int getRandomIntFromRange(int startInt, int endInt) {
        return (int) (startInt + Math.random() * endInt);
    }

    public static String getRandomValueFromArray(String[] value) {
        return value[(int) ((Math.random() * (value.length)))];
    }


}
