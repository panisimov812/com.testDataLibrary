package utils.helpers;

import data.namesData.eng.FemaleNamesBank;
import data.namesData.eng.MaleNamesBank;
import data.namesData.eng.maps.MaleNamesMap;
import data.namesData.rus.FemaleNamesBankRus;
import data.namesData.rus.MaleNamesBankRus;

import java.util.HashMap;

public class NameHelper extends RandomDataHelper {


    public static String getRandomNameFromAllArrays() {
        HashMap<Integer, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put(0, returnRandomValueFromArray(MaleNamesBank.getLetterA()));
        namesGettersMap.put(1, returnRandomValueFromArray(MaleNamesBank.getLetterB()));
        namesGettersMap.put(2, returnRandomValueFromArray(MaleNamesBank.getLetterC()));
        namesGettersMap.put(3, returnRandomValueFromArray(MaleNamesBank.getLetterD()));
        namesGettersMap.put(4, returnRandomValueFromArray(MaleNamesBank.getLetterE()));
        namesGettersMap.put(5, returnRandomValueFromArray(MaleNamesBank.getLetterF()));
        namesGettersMap.put(6, returnRandomValueFromArray(MaleNamesBank.getLetterG()));
        namesGettersMap.put(7, returnRandomValueFromArray(MaleNamesBank.getLetterH()));
        namesGettersMap.put(8, returnRandomValueFromArray(MaleNamesBank.getLetterI()));
        namesGettersMap.put(9, returnRandomValueFromArray(MaleNamesBank.getLetterJ()));
        namesGettersMap.put(10, returnRandomValueFromArray(MaleNamesBank.getLetterK()));
        namesGettersMap.put(11, returnRandomValueFromArray(MaleNamesBank.getLetterL()));
        namesGettersMap.put(12, returnRandomValueFromArray(MaleNamesBank.getLetterM()));
        namesGettersMap.put(13, returnRandomValueFromArray(MaleNamesBank.getLetterN()));
        namesGettersMap.put(14, returnRandomValueFromArray(MaleNamesBank.getLetterO()));
        namesGettersMap.put(15, returnRandomValueFromArray(MaleNamesBank.getLetterP()));
        namesGettersMap.put(16, returnRandomValueFromArray(MaleNamesBank.getLetterQ()));
        namesGettersMap.put(17, returnRandomValueFromArray(MaleNamesBank.getLetterR()));
        namesGettersMap.put(18, returnRandomValueFromArray(MaleNamesBank.getLetterS()));
        namesGettersMap.put(19, returnRandomValueFromArray(MaleNamesBank.getLetterT()));
        namesGettersMap.put(20, returnRandomValueFromArray(MaleNamesBank.getLetterU()));
        namesGettersMap.put(21, returnRandomValueFromArray(MaleNamesBank.getLetterV()));
        namesGettersMap.put(22, returnRandomValueFromArray(MaleNamesBank.getLetterW()));
        namesGettersMap.put(23, returnRandomValueFromArray(MaleNamesBank.getLetterX()));
        namesGettersMap.put(24, returnRandomValueFromArray(MaleNamesBank.getLetterY()));
        namesGettersMap.put(25, returnRandomValueFromArray(MaleNamesBank.getLetterZ()));
        return (String) namesGettersMap.get(returnRandomIntFromRange(0, 25));
    }

    public static String getRandomNameFromAllArraysByGender(String genderValue) {
        HashMap<Integer, Object> namesMap = new HashMap<>();
        if (("male".equalsIgnoreCase(genderValue))) return getRandomNameFromAllArrays();
        else if ((("female".equalsIgnoreCase(genderValue)))) {
            //todo так же создать мапу на русские имена и добавить сюда
            namesMap.put(0, returnRandomValueFromArray(FemaleNamesBank.getLetterA()));
            namesMap.put(1, returnRandomValueFromArray(FemaleNamesBank.getLetterB()));
            return (String) namesMap.get(returnRandomIntFromRange(0, 2));
        }
        //todo понять нужно ли сюда добавлять исключение так как оно не появится для пользока просто так
        else throw new IllegalArgumentException(genderValue + ": is incorrect gender value");
    }

    public String getRandomMaleEngName() {
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

    public String getRandomMaleRusName() {
        HashMap<Integer, Object> namesMaleRusMap = new HashMap<>();
        namesMaleRusMap.put(0, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusA()));
        namesMaleRusMap.put(1, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusBE()));
        namesMaleRusMap.put(2, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusVE()));
        namesMaleRusMap.put(3, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusGE()));
        namesMaleRusMap.put(4, returnRandomValueFromArray(MaleNamesBankRus.getLetterRusDE()));
        return (String) namesMaleRusMap.get(returnRandomIntFromRange(0, 4));
    }

    public String getRandomFemaleRusName() {
        HashMap<Integer, Object> namesFemaleRusMap = new HashMap<>();
        namesFemaleRusMap.put(0, returnRandomValueFromArray(FemaleNamesBankRus.getLetterA()));
        namesFemaleRusMap.put(1, returnRandomValueFromArray(FemaleNamesBankRus.getLetterBE()));
        return (String) namesFemaleRusMap.get(returnRandomIntFromRange(0, 2));
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
        MaleNamesMap.getRandomNameFromMapWithStringKey(letter);
        return letter;
    }

}
