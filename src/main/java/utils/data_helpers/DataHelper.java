package utils.data_helpers;

import data.namesData.lastName.eng.MaleEngLastNamesArrays;
import data.namesData.names.eng.FemaleEngNamesArrays;
import data.namesData.names.eng.MaleEngNamesArrays;
import data.namesData.names.rus.FemaleRusNamesArrays;
import data.namesData.names.rus.MaleRusNamesArrays;

import java.util.HashMap;

import static utils.value_helpers.ValuesHelper.*;
import static utils.value_helpers.RandomValuesHelpers.getRandomIntFromRange;
import static utils.value_helpers.RandomValuesHelpers.getRandomValueFromArray;

public class DataHelper {

    public static String getRandomMaleEngName() {
        HashMap<Integer, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put(0, getRandomValueFromArray(MaleEngNamesArrays.getLetterA()));
        namesGettersMap.put(1, getRandomValueFromArray(MaleEngNamesArrays.getLetterB()));
        namesGettersMap.put(2, getRandomValueFromArray(MaleEngNamesArrays.getLetterC()));
        namesGettersMap.put(3, getRandomValueFromArray(MaleEngNamesArrays.getLetterD()));
        namesGettersMap.put(4, getRandomValueFromArray(MaleEngNamesArrays.getLetterE()));
        namesGettersMap.put(5, getRandomValueFromArray(MaleEngNamesArrays.getLetterF()));
        namesGettersMap.put(6, getRandomValueFromArray(MaleEngNamesArrays.getLetterG()));
        namesGettersMap.put(7, getRandomValueFromArray(MaleEngNamesArrays.getLetterH()));
        namesGettersMap.put(8, getRandomValueFromArray(MaleEngNamesArrays.getLetterI()));
        namesGettersMap.put(9, getRandomValueFromArray(MaleEngNamesArrays.getLetterJ()));
        namesGettersMap.put(10, getRandomValueFromArray(MaleEngNamesArrays.getLetterK()));
        namesGettersMap.put(11, getRandomValueFromArray(MaleEngNamesArrays.getLetterL()));
        namesGettersMap.put(12, getRandomValueFromArray(MaleEngNamesArrays.getLetterM()));
        namesGettersMap.put(13, getRandomValueFromArray(MaleEngNamesArrays.getLetterN()));
        namesGettersMap.put(14, getRandomValueFromArray(MaleEngNamesArrays.getLetterO()));
        namesGettersMap.put(15, getRandomValueFromArray(MaleEngNamesArrays.getLetterP()));
        namesGettersMap.put(16, getRandomValueFromArray(MaleEngNamesArrays.getLetterQ()));
        namesGettersMap.put(17, getRandomValueFromArray(MaleEngNamesArrays.getLetterR()));
        namesGettersMap.put(18, getRandomValueFromArray(MaleEngNamesArrays.getLetterS()));
        namesGettersMap.put(19, getRandomValueFromArray(MaleEngNamesArrays.getLetterT()));
        namesGettersMap.put(20, getRandomValueFromArray(MaleEngNamesArrays.getLetterU()));
        namesGettersMap.put(21, getRandomValueFromArray(MaleEngNamesArrays.getLetterV()));
        namesGettersMap.put(22, getRandomValueFromArray(MaleEngNamesArrays.getLetterW()));
        namesGettersMap.put(23, getRandomValueFromArray(MaleEngNamesArrays.getLetterX()));
        namesGettersMap.put(24, getRandomValueFromArray(MaleEngNamesArrays.getLetterY()));
        namesGettersMap.put(25, getRandomValueFromArray(MaleEngNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(getRandomIntFromRange(0, 25));
    }

    public static String getRandomMaleRusName() {
        HashMap<Integer, Object> namesMaleRusMap = new HashMap<>();
        namesMaleRusMap.put(0, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusA()));
        namesMaleRusMap.put(1, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusBE()));
        namesMaleRusMap.put(2, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusVE()));
        namesMaleRusMap.put(3, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusGE()));
        namesMaleRusMap.put(4, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusDE()));
        namesMaleRusMap.put(6, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusE()));
        namesMaleRusMap.put(7, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusJE()));
        namesMaleRusMap.put(8, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusZE()));
        namesMaleRusMap.put(9, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusI()));
        namesMaleRusMap.put(10, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusYI()));
        namesMaleRusMap.put(11, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusK()));
        namesMaleRusMap.put(12, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusEL()));
        namesMaleRusMap.put(13, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusM()));
        namesMaleRusMap.put(14, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusN()));
        namesMaleRusMap.put(15, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusO()));
        namesMaleRusMap.put(16, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusP()));
        namesMaleRusMap.put(17, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusER()));
        namesMaleRusMap.put(18, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusES()));
        namesMaleRusMap.put(20, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusJU()));
        namesMaleRusMap.put(21, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusF()));
        namesMaleRusMap.put(22, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusHA()));
        namesMaleRusMap.put(23, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusCE()));
        namesMaleRusMap.put(25, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusEA()));
        namesMaleRusMap.put(26, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusU()));
        namesMaleRusMap.put(27, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusYA()));
        return (String) namesMaleRusMap.get(getRandomIntFromRange(0, 27));
    }

    public static String getRandomFemaleRusName() {
        HashMap<Integer, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put(0, getRandomValueFromArray(FemaleRusNamesArrays.getLetterA()));
        namesGettersMap.put(1, getRandomValueFromArray(FemaleRusNamesArrays.getLetterBE()));
        namesGettersMap.put(2, getRandomValueFromArray(FemaleRusNamesArrays.getLeterVE()));
        namesGettersMap.put(3, getRandomValueFromArray(FemaleRusNamesArrays.getLetterGE()));
        namesGettersMap.put(4, getRandomValueFromArray(FemaleRusNamesArrays.getLetterDE()));
        namesGettersMap.put(5, getRandomValueFromArray(FemaleRusNamesArrays.getLetterE()));
        namesGettersMap.put(6, getRandomValueFromArray(FemaleRusNamesArrays.getLetterJE()));
        namesGettersMap.put(7, getRandomValueFromArray(FemaleRusNamesArrays.getLetterZE()));
        namesGettersMap.put(8, getRandomValueFromArray(FemaleRusNamesArrays.getLetterI()));
        namesGettersMap.put(9, getRandomValueFromArray(FemaleRusNamesArrays.getLetterKE()));
        namesGettersMap.put(10, getRandomValueFromArray(FemaleRusNamesArrays.getLetterLE()));
        namesGettersMap.put(11, getRandomValueFromArray(FemaleRusNamesArrays.getLetterM()));
        namesGettersMap.put(12, getRandomValueFromArray(FemaleRusNamesArrays.getLetterNE()));
        namesGettersMap.put(13, getRandomValueFromArray(FemaleRusNamesArrays.getLetterO()));
        namesGettersMap.put(14, getRandomValueFromArray(FemaleRusNamesArrays.getLetterPE()));
        namesGettersMap.put(15, getRandomValueFromArray(FemaleRusNamesArrays.getLetterRE()));
        namesGettersMap.put(16, getRandomValueFromArray(FemaleRusNamesArrays.getLetterSE()));
        namesGettersMap.put(17, getRandomValueFromArray(FemaleRusNamesArrays.getLetterTE()));
        namesGettersMap.put(18, getRandomValueFromArray(FemaleRusNamesArrays.getLetterU()));
        namesGettersMap.put(19, getRandomValueFromArray(FemaleRusNamesArrays.getLetterFE()));
        namesGettersMap.put(20, getRandomValueFromArray(FemaleRusNamesArrays.getLetterU()));
        namesGettersMap.put(21, getRandomValueFromArray(FemaleRusNamesArrays.getLetterHA()));
        namesGettersMap.put(22, getRandomValueFromArray(FemaleRusNamesArrays.getLetterCE()));
        namesGettersMap.put(23, getRandomValueFromArray(FemaleRusNamesArrays.getLetterCHE()));
        namesGettersMap.put(24, getRandomValueFromArray(FemaleRusNamesArrays.getLetterSHA()));
        namesGettersMap.put(25, getRandomValueFromArray(FemaleRusNamesArrays.getLetterYU()));
        namesGettersMap.put(26, getRandomValueFromArray(FemaleRusNamesArrays.getLetterYA()));
        return (String) namesGettersMap.get(getRandomIntFromRange(0, 26));
    }

    public static String getValueByLetter(String valueLetter) {
        HashMap<String, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put("a", getRandomValueFromArray(MaleEngNamesArrays.getLetterA()));
        namesGettersMap.put("b", getRandomValueFromArray(MaleEngNamesArrays.getLetterB()));
        namesGettersMap.put("c", getRandomValueFromArray(MaleEngNamesArrays.getLetterC()));
        namesGettersMap.put("d", getRandomValueFromArray(MaleEngNamesArrays.getLetterD()));
        namesGettersMap.put("e", getRandomValueFromArray(MaleEngNamesArrays.getLetterE()));
        namesGettersMap.put("f", getRandomValueFromArray(MaleEngNamesArrays.getLetterF()));
        namesGettersMap.put("g", getRandomValueFromArray(MaleEngNamesArrays.getLetterG()));
        namesGettersMap.put("h", getRandomValueFromArray(MaleEngNamesArrays.getLetterH()));
        namesGettersMap.put("i", getRandomValueFromArray(MaleEngNamesArrays.getLetterI()));
        namesGettersMap.put("j", getRandomValueFromArray(MaleEngNamesArrays.getLetterJ()));
        namesGettersMap.put("k", getRandomValueFromArray(MaleEngNamesArrays.getLetterK()));
        namesGettersMap.put("l", getRandomValueFromArray(MaleEngNamesArrays.getLetterL()));
        namesGettersMap.put("m", getRandomValueFromArray(MaleEngNamesArrays.getLetterM()));
        namesGettersMap.put("n", getRandomValueFromArray(MaleEngNamesArrays.getLetterN()));
        namesGettersMap.put("o", getRandomValueFromArray(MaleEngNamesArrays.getLetterO()));
        namesGettersMap.put("p", getRandomValueFromArray(MaleEngNamesArrays.getLetterP()));
        namesGettersMap.put("q", getRandomValueFromArray(MaleEngNamesArrays.getLetterQ()));
        namesGettersMap.put("r", getRandomValueFromArray(MaleEngNamesArrays.getLetterR()));
        namesGettersMap.put("s", getRandomValueFromArray(MaleEngNamesArrays.getLetterS()));
        namesGettersMap.put("t", getRandomValueFromArray(MaleEngNamesArrays.getLetterT()));
        namesGettersMap.put("u", getRandomValueFromArray(MaleEngNamesArrays.getLetterU()));
        namesGettersMap.put("v", getRandomValueFromArray(MaleEngNamesArrays.getLetterV()));
        namesGettersMap.put("w", getRandomValueFromArray(MaleEngNamesArrays.getLetterW()));
        namesGettersMap.put("x", getRandomValueFromArray(MaleEngNamesArrays.getLetterX()));
        namesGettersMap.put("y", getRandomValueFromArray(MaleEngNamesArrays.getLetterY()));
        namesGettersMap.put("z", getRandomValueFromArray(MaleEngNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(valueLetter);
    }

    public static String getRandomNameFromAllArraysByGender(String genderValue) {
        return comparisonValuesForGenderAndLocalisationDataSelector("male",
                "female",
                genderValue);
    }

    public static String genderAndLocalisationDataSelector(String genderValue, String localisation) {
        return comparisonValuesForGenderAndLocalisationDataSelector("male",
                "female",
                "eng",
                "rus",
                genderValue,
                localisation);
    }

    // add

    public static String getRandomMaleEngLastName() {
        HashMap<Integer, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put(0, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterA()));
        namesGettersMap.put(1, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterB()));
        namesGettersMap.put(2, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterC()));
        namesGettersMap.put(3, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterD()));
        namesGettersMap.put(4, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterE()));
        namesGettersMap.put(5, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterF()));
        namesGettersMap.put(6, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterG()));
        namesGettersMap.put(7, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterH()));
        namesGettersMap.put(8, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterI()));
        namesGettersMap.put(9, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterJ()));
        namesGettersMap.put(10, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterK()));
        namesGettersMap.put(11, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterL()));
        namesGettersMap.put(12, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterM()));
        namesGettersMap.put(13, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterN()));
        namesGettersMap.put(14, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterO()));
        namesGettersMap.put(15, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterP()));
        namesGettersMap.put(16, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterQ()));
        namesGettersMap.put(17, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterR()));
        namesGettersMap.put(18, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterS()));
        namesGettersMap.put(19, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterT()));
        namesGettersMap.put(20, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterU()));
        namesGettersMap.put(21, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterV()));
        namesGettersMap.put(22, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterW()));
        namesGettersMap.put(23, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterX()));
        namesGettersMap.put(24, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterY()));
        namesGettersMap.put(25, getRandomValueFromArray(MaleEngLastNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(getRandomIntFromRange(0, 25));
    }

    public static String getRandomMaleRusLastName() {
        HashMap<Integer, Object> namesMaleRusMap = new HashMap<>();
        namesMaleRusMap.put(0, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusA()));
        namesMaleRusMap.put(1, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusBE()));
        namesMaleRusMap.put(2, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusVE()));
        namesMaleRusMap.put(3, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusGE()));
        namesMaleRusMap.put(4, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusDE()));
        namesMaleRusMap.put(6, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusE()));
        namesMaleRusMap.put(7, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusJE()));
        namesMaleRusMap.put(8, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusZE()));
        namesMaleRusMap.put(9, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusI()));
        namesMaleRusMap.put(10, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusYI()));
        namesMaleRusMap.put(11, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusK()));
        namesMaleRusMap.put(12, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusEL()));
        namesMaleRusMap.put(13, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusM()));
        namesMaleRusMap.put(14, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusN()));
        namesMaleRusMap.put(15, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusO()));
        namesMaleRusMap.put(16, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusP()));
        namesMaleRusMap.put(17, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusER()));
        namesMaleRusMap.put(18, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusES()));
        namesMaleRusMap.put(20, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusJU()));
        namesMaleRusMap.put(21, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusF()));
        namesMaleRusMap.put(22, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusHA()));
        namesMaleRusMap.put(23, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusCE()));
        namesMaleRusMap.put(25, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusEA()));
        namesMaleRusMap.put(26, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusU()));
        namesMaleRusMap.put(27, getRandomValueFromArray(MaleRusNamesArrays.getLetterRusYA()));
        return (String) namesMaleRusMap.get(getRandomIntFromRange(0, 27));
    }

    public static String getRandomFemaleRusLastName() {
        HashMap<Integer, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put(0, getRandomValueFromArray(FemaleEngNamesArrays.getLetterA()));
        namesGettersMap.put(1, getRandomValueFromArray(FemaleEngNamesArrays.getLetterB()));
        namesGettersMap.put(2, getRandomValueFromArray(FemaleEngNamesArrays.getLetterC()));
        namesGettersMap.put(3, getRandomValueFromArray(FemaleEngNamesArrays.getLetterD()));
        namesGettersMap.put(4, getRandomValueFromArray(FemaleEngNamesArrays.getLetterE()));
        namesGettersMap.put(5, getRandomValueFromArray(FemaleEngNamesArrays.getLetterF()));
        namesGettersMap.put(6, getRandomValueFromArray(FemaleEngNamesArrays.getLetterG()));
        namesGettersMap.put(7, getRandomValueFromArray(FemaleEngNamesArrays.getLetterH()));
        namesGettersMap.put(8, getRandomValueFromArray(FemaleEngNamesArrays.getLetterI()));
        namesGettersMap.put(9, getRandomValueFromArray(FemaleEngNamesArrays.getLetterJ()));
        namesGettersMap.put(10, getRandomValueFromArray(FemaleEngNamesArrays.getLetterK()));
        namesGettersMap.put(11, getRandomValueFromArray(FemaleEngNamesArrays.getLetterL()));
        namesGettersMap.put(12, getRandomValueFromArray(FemaleEngNamesArrays.getLetterM()));
        namesGettersMap.put(13, getRandomValueFromArray(FemaleEngNamesArrays.getLetterN()));
        namesGettersMap.put(14, getRandomValueFromArray(FemaleEngNamesArrays.getLetterO()));
        namesGettersMap.put(15, getRandomValueFromArray(FemaleEngNamesArrays.getLetterP()));
        namesGettersMap.put(16, getRandomValueFromArray(FemaleEngNamesArrays.getLetterQ()));
        namesGettersMap.put(17, getRandomValueFromArray(FemaleEngNamesArrays.getLetterR()));
        namesGettersMap.put(18, getRandomValueFromArray(FemaleEngNamesArrays.getLetterS()));
        namesGettersMap.put(19, getRandomValueFromArray(FemaleEngNamesArrays.getLetterT()));
        namesGettersMap.put(20, getRandomValueFromArray(FemaleEngNamesArrays.getLetterU()));
        namesGettersMap.put(21, getRandomValueFromArray(FemaleEngNamesArrays.getLetterV()));
        namesGettersMap.put(22, getRandomValueFromArray(FemaleEngNamesArrays.getLetterW()));
        namesGettersMap.put(23, getRandomValueFromArray(FemaleEngNamesArrays.getLetterX()));
        namesGettersMap.put(24, getRandomValueFromArray(FemaleEngNamesArrays.getLetterY()));
        namesGettersMap.put(25, getRandomValueFromArray(FemaleEngNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(getRandomIntFromRange(0, 25));
    }

    public static String getValueByLetterForLastName(String valueLetter) {
        HashMap<String, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put("a", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterA()));
        namesGettersMap.put("b", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterB()));
        namesGettersMap.put("c", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterC()));
        namesGettersMap.put("d", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterD()));
        namesGettersMap.put("e", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterE()));
        namesGettersMap.put("f", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterF()));
        namesGettersMap.put("g", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterG()));
        namesGettersMap.put("h", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterH()));
        namesGettersMap.put("i", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterI()));
        namesGettersMap.put("j", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterJ()));
        namesGettersMap.put("k", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterK()));
        namesGettersMap.put("l", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterL()));
        namesGettersMap.put("m", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterM()));
        namesGettersMap.put("n", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterN()));
        namesGettersMap.put("o", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterO()));
        namesGettersMap.put("p", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterP()));
        namesGettersMap.put("q", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterQ()));
        namesGettersMap.put("r", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterR()));
        namesGettersMap.put("s", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterS()));
        namesGettersMap.put("t", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterT()));
        namesGettersMap.put("u", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterU()));
        namesGettersMap.put("v", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterV()));
        namesGettersMap.put("w", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterW()));
        namesGettersMap.put("x", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterX()));
        namesGettersMap.put("y", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterY()));
        namesGettersMap.put("z", getRandomValueFromArray(MaleEngLastNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(valueLetter);
    }

    public static String getRandomLastNameFromAllArraysByGender(String genderValue) {
        return comparisonValuesForGenderAndLocalisationDataSelector("male",
                "female",
                genderValue);
    }

}
