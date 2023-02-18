package utils.helpers;

import static utils.helpers.NameHelper.*;

public class MainHelper {

    public static int getRandomIntFromRange(int startInt, int endInt) {
        return (int) (startInt + Math.random() * endInt);
    }

    public static String getRandomValueFromArray(String[] value) {
        return value[(int) ((Math.random() * (value.length)))];
    }

    public static String getValueByGenderAndLocalization(String gender, String localisation) {
        if (("male".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation)))
            return getRandomMaleEngName();
        else if (("male".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation)))
            return getRandomMaleRusName();
        else if (("female".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation)))
            return getRandomFemaleRusName();
        else if (("female".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation)))
            return getRandomFemaleRusName();
        return gender;
    }

    public static String equalsThreeValues(String firstReferenceValue,
                                           String secondReferenceValue,
                                           String thirdReferenceValue) {

        if ((firstReferenceValue.equalsIgnoreCase(thirdReferenceValue))) return getRandomMaleEngName();
        else if (((secondReferenceValue.equalsIgnoreCase(thirdReferenceValue)))) return getRandomFemaleRusName();
        else
            throw new IllegalArgumentException("Value " + "'" + thirdReferenceValue + "'" + " is " +
                    "incorrect, use: male or female");
    }

    //todo првоерить работу с женским именем
    public static String equalsSixValues(String firstReferenceValue, String secondReferenceValue,
                                         String thirdReferenceValue, String fourthReferenceValue,
                                         String fifthElement, String sixthElement) {
        if ((firstReferenceValue.equalsIgnoreCase(fifthElement)) & (thirdReferenceValue.equalsIgnoreCase(sixthElement))) {
            return getValueByGenderAndLocalization(firstReferenceValue, thirdReferenceValue);
        } else if ((firstReferenceValue.equalsIgnoreCase(fifthElement)) & (fourthReferenceValue.equalsIgnoreCase(sixthElement))) {
            return getValueByGenderAndLocalization(firstReferenceValue, fourthReferenceValue);
        } else if ((secondReferenceValue.equalsIgnoreCase(fifthElement)) & (thirdReferenceValue.equalsIgnoreCase(sixthElement))) {
            return getValueByGenderAndLocalization(secondReferenceValue, thirdReferenceValue);
        } else if ((secondReferenceValue.equalsIgnoreCase(fifthElement)) & (fourthReferenceValue.equalsIgnoreCase(sixthElement))) {
            return getValueByGenderAndLocalization(secondReferenceValue, fourthReferenceValue);
        } else throw new IllegalArgumentException("Value " + "'" + fifthElement + "'" + "" +
                " is incorrect, use: male or female");
    }

    public static String comparisonValuesForGenderAndLocalisationDataSelector(String firstReferenceValue,
                                                                              String secondReferenceValue,
                                                                              String thirdReferenceValue) {
        return equalsThreeValues(firstReferenceValue, secondReferenceValue, thirdReferenceValue);
    }

    public static String comparisonValuesForGenderAndLocalisationDataSelector(String firstReferenceValue,
                                                                              String secondReferenceValue,
                                                                              String thirdReferenceValue,
                                                                              String fourthReferenceValue,
                                                                              String genderValue,
                                                                              String localisation) {
        return equalsSixValues(firstReferenceValue,
                secondReferenceValue,
                thirdReferenceValue,
                fourthReferenceValue,
                genderValue,
                localisation);
    }

    public static String returnRandomValuesFrom(String[] firstArray, String[] secondArray) {
        return getRandomValueFromArray(firstArray) + " " + getRandomValueFromArray(secondArray);
    }
//
//    public static boolean returnEvenOrOddInteger() {
//        int randomInteger = random.nextInt(2);
//        return (randomInteger % 2 == 0);
//    }

}
