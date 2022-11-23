package utils.helper;

import java.util.Random;

public class RandomDataHelper {
    static Random random = new Random();

     public static boolean returnEvenOrOddInteger(){
        int randomInteger = random.nextInt(2);
        return (randomInteger % 2 == 0);
    }

    public static String getRandomValueFromArray(String[] namesArray){
        return namesArray[(int) ((Math.random() * (namesArray.length)))];
    }

    //todo переделать на return
    public static void returnRandomValueBetween(String[] value1, String[] value2){
         if (returnEvenOrOddInteger()) {
             System.out.println(getRandomValueFromArray(value1));
         } else {
             System.out.println(getRandomValueFromArray(value2));
         }
    }


}
