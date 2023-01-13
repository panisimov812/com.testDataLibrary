package utils.helpers;

import data.namesData.rus.FemaleNamesBankRus;
import data.namesData.rus.MaleNamesBankRus;

import java.util.HashMap;

import static data.namesData.eng.maps.FemaleEngNamesMap.getRandomFemaleNameFromMapWithIntegerKey;
import static data.namesData.eng.maps.MaleEngNamesMap.getRandomMaleNameFromMapWithIntegerKey;
import static data.namesData.eng.maps.MaleEngNamesMap.getRandomMaleNameFromMapWithStringKey;

public class NameHelper extends RandomDataHelper {

    public static String getRandomMaleEngName() {
        return getRandomMaleNameFromMapWithIntegerKey();
    }

    public static String getValueByLetter(String valueLetter) {
        return getRandomMaleNameFromMapWithStringKey(valueLetter);
    }

    public static String getRandomNameFromAllArraysByGender(String genderValue) {
        if (("male".equalsIgnoreCase(genderValue))) return getRandomMaleNameFromMapWithIntegerKey();
        else if ((("female".equalsIgnoreCase(genderValue)))) return getRandomFemaleNameFromMapWithIntegerKey();
        else throw new IllegalArgumentException("Value "+ "'" + genderValue + "'" + " is incorrect, use: male or female");
    }

    public String getRandomMaleRusName() {
        HashMap<Integer, Object> namesMaleRusMap = new HashMap<>();
        namesMaleRusMap.put(0, getRandomValueFromArray(MaleNamesBankRus.getLetterRusA()));
        namesMaleRusMap.put(1, getRandomValueFromArray(MaleNamesBankRus.getLetterRusBE()));
        namesMaleRusMap.put(2, getRandomValueFromArray(MaleNamesBankRus.getLetterRusVE()));
        namesMaleRusMap.put(3, getRandomValueFromArray(MaleNamesBankRus.getLetterRusGE()));
        namesMaleRusMap.put(4, getRandomValueFromArray(MaleNamesBankRus.getLetterRusDE()));
        return (String) namesMaleRusMap.get(getRandomIntFromRange(0, 4));
    }

    public String getRandomFemaleRusName() {
        HashMap<Integer, Object> namesFemaleRusMap = new HashMap<>();
        namesFemaleRusMap.put(0, getRandomValueFromArray(FemaleNamesBankRus.getLetterA()));
        namesFemaleRusMap.put(1, getRandomValueFromArray(FemaleNamesBankRus.getLetterBE()));
        return (String) namesFemaleRusMap.get(getRandomIntFromRange(0, 2));
    }

    public String getValueByGenderAndLocalization(String gender, String localisation) {
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

    //todo дописать реализацию более красивую чем if
    public static String getNameByLetter(String letter) {
        getRandomMaleNameFromMapWithStringKey(letter);
        return letter;
    }

}
