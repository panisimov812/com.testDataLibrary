package utils.helpers;

import static utils.helpers.NameHelper.getRandomFemaleRusName;
import static utils.helpers.NameHelper.getRandomMaleEngName;

public class DataHelper {

    static NameHelper nameHelper = new NameHelper();

    public static String equalsThreeValues(String firstReferenceValue,
                                           String secondReferenceValue,
                                           String thirdReferenceValue) {
        if ((firstReferenceValue.equalsIgnoreCase(thirdReferenceValue))) return getRandomMaleEngName();
        else if (((secondReferenceValue.equalsIgnoreCase(thirdReferenceValue)))) return getRandomFemaleRusName();
        else
            throw new IllegalArgumentException("Value " + "'" + thirdReferenceValue + "'" + " is " +
                    "incorrect, use: male or female");
    }

    public static String equalsSixValues(String firstReferenceValue, String secondReferenceValue,
                                         String thirdReferenceValue, String fourthReferenceValue,
                                         String fifthElement, String sixthElement) {
        if ((firstReferenceValue.equalsIgnoreCase(fifthElement)) & (thirdReferenceValue.equalsIgnoreCase(sixthElement))) {
            return nameHelper.getValueByGenderAndLocalization(firstReferenceValue, thirdReferenceValue);
        } else if ((firstReferenceValue.equalsIgnoreCase(fifthElement)) & (fourthReferenceValue.equalsIgnoreCase(sixthElement))) {
            return nameHelper.getValueByGenderAndLocalization(firstReferenceValue, fourthReferenceValue);
        } else if ((secondReferenceValue.equalsIgnoreCase(fifthElement)) & (thirdReferenceValue.equalsIgnoreCase(sixthElement))) {
            return nameHelper.getValueByGenderAndLocalization(secondReferenceValue, thirdReferenceValue);
        } else if ((secondReferenceValue.equalsIgnoreCase(fifthElement)) & (fourthReferenceValue.equalsIgnoreCase(sixthElement))) {
            return nameHelper.getValueByGenderAndLocalization(secondReferenceValue, fourthReferenceValue);
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

}
