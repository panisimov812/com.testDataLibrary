package utils;

import data.namesData.eng.FemaleNamesBank;
import data.namesData.eng.MaleNamesBank;
import data.namesData.rus.FemaleNamesBankRus;
import data.namesData.rus.MaleNamesBankRus;

import java.util.HashMap;

public class NameHelper extends RandomDataHelper {

    //todo дописать реализацию
    public static String returnNameByLetter(String letter) {
        if (letter.equalsIgnoreCase("a"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterA());
        else if (letter.equalsIgnoreCase("b"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterB());
        else if (letter.equalsIgnoreCase("c"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterC());
        else if (letter.equalsIgnoreCase("d"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterD());
        else if (letter.equalsIgnoreCase("e"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterE());
        else if (letter.equalsIgnoreCase("F"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterF());
        else if (letter.equalsIgnoreCase("g"))
            return returnRandomValueFromArray(MaleNamesBank.getLetterG());
        else {
            throw new IllegalArgumentException(letter+": is incorrect symbol");
        }
    }

    public static String returnRandomNameFromAllArraysByGender(String genderValue) {
        HashMap<Integer, Object> namesMap = new HashMap<>();
        if (("male".equalsIgnoreCase(genderValue))) {
            namesMap.put(0, returnRandomValueFromArray(MaleNamesBank.getLetterA()));
            namesMap.put(1, returnRandomValueFromArray(MaleNamesBank.getLetterB()));
            namesMap.put(2, returnRandomValueFromArray(MaleNamesBank.getLetterC()));
            namesMap.put(3, returnRandomValueFromArray(MaleNamesBank.getLetterD()));
            namesMap.put(4, returnRandomValueFromArray(MaleNamesBank.getLetterE()));
            namesMap.put(5, returnRandomValueFromArray(MaleNamesBank.getLetterF()));
            namesMap.put(6, returnRandomValueFromArray(MaleNamesBank.getLetterG()));
            namesMap.put(7, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusA()));
            namesMap.put(8, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusBE()));
            namesMap.put(9, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusVE()));
            namesMap.put(10, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusGE()));
            namesMap.put(11, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusDE()));
            return (String) namesMap.get(returnRandomIntFromRange(0, 11));
        } else if ((("female".equalsIgnoreCase(genderValue)))) {
            namesMap.put(0, returnRandomValueFromArray(FemaleNamesBank.getLetterA()));
            namesMap.put(1, returnRandomValueFromArray(FemaleNamesBank.getLetterB()));
            return (String) namesMap.get(returnRandomIntFromRange(0, 2));
        }
        return genderValue;
    }

    public String returnRandomMaleEngName() {
        HashMap<Integer, Object> namesMaleEngMap = new HashMap<>();
        namesMaleEngMap.put(0, returnRandomValueFromArray(MaleNamesBank.getLetterA()));
        namesMaleEngMap.put(1, returnRandomValueFromArray(MaleNamesBank.getLetterB()));
        namesMaleEngMap.put(2, returnRandomValueFromArray(MaleNamesBank.getLetterC()));
        namesMaleEngMap.put(3, returnRandomValueFromArray(MaleNamesBank.getLetterD()));
        namesMaleEngMap.put(4, returnRandomValueFromArray(MaleNamesBank.getLetterE()));
        namesMaleEngMap.put(5, returnRandomValueFromArray(MaleNamesBank.getLetterF()));
        namesMaleEngMap.put(6, returnRandomValueFromArray(MaleNamesBank.getLetterG()));
        return (String) namesMaleEngMap.get(returnRandomIntFromRange(0, 6));
    }

    public String returnRandomMaleRusName() {
        HashMap<Integer, Object> namesMaleRusMap = new HashMap<>();
        namesMaleRusMap.put(0, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusA()));
        namesMaleRusMap.put(1, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusBE()));
        namesMaleRusMap.put(2, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusVE()));
        namesMaleRusMap.put(3, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusGE()));
        namesMaleRusMap.put(4, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusDE()));
        return (String) namesMaleRusMap.get(returnRandomIntFromRange(0, 4));
    }

    public String returnRandomFemaleRusName() {
        HashMap<Integer, Object> namesFemaleRusMap = new HashMap<>();
        namesFemaleRusMap.put(0, returnRandomValueFromArray(FemaleNamesBankRus.getLetterA()));
        namesFemaleRusMap.put(1, returnRandomValueFromArray(FemaleNamesBankRus.getLetterBE()));
        return (String) namesFemaleRusMap.get(returnRandomIntFromRange(0, 2));
    }

    public String returnValueByGenderAndLocalization(String gender, String localisation) {
        if (("male".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation)))
            return returnRandomMaleEngName();
        else if (("male".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation)))
            return returnRandomMaleRusName();
        else if (("female".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation)))
            return returnRandomFemaleRusName();
        else if (("female".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation)))
            return returnRandomFemaleRusName();
        return gender;
    }

}
