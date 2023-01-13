package data.namesData.eng.maps;

import data.namesData.eng.FemaleNamesArrays;
import data.namesData.eng.MaleNamesArrays;
import utils.helpers.RandomDataHelper;

import java.util.HashMap;

public class FemaleEngNamesMap extends RandomDataHelper {

    public static String getRandomFemaleNameFromMapWithStringKey(String valueLetter) {
        HashMap<String, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put("a", getRandomValueFromArray(MaleNamesArrays.getLetterA()));
        namesGettersMap.put("b", getRandomValueFromArray(MaleNamesArrays.getLetterB()));
        namesGettersMap.put("c", getRandomValueFromArray(MaleNamesArrays.getLetterC()));
        namesGettersMap.put("d", getRandomValueFromArray(MaleNamesArrays.getLetterD()));
        namesGettersMap.put("e", getRandomValueFromArray(MaleNamesArrays.getLetterE()));
        namesGettersMap.put("f", getRandomValueFromArray(MaleNamesArrays.getLetterF()));
        namesGettersMap.put("g", getRandomValueFromArray(MaleNamesArrays.getLetterG()));
        namesGettersMap.put("h", getRandomValueFromArray(MaleNamesArrays.getLetterH()));
        namesGettersMap.put("i", getRandomValueFromArray(MaleNamesArrays.getLetterI()));
        namesGettersMap.put("j", getRandomValueFromArray(MaleNamesArrays.getLetterJ()));
        namesGettersMap.put("k", getRandomValueFromArray(MaleNamesArrays.getLetterK()));
        namesGettersMap.put("l", getRandomValueFromArray(MaleNamesArrays.getLetterL()));
        namesGettersMap.put("m", getRandomValueFromArray(MaleNamesArrays.getLetterM()));
        namesGettersMap.put("n", getRandomValueFromArray(MaleNamesArrays.getLetterN()));
        namesGettersMap.put("o", getRandomValueFromArray(MaleNamesArrays.getLetterO()));
        namesGettersMap.put("p", getRandomValueFromArray(MaleNamesArrays.getLetterP()));
        namesGettersMap.put("q", getRandomValueFromArray(MaleNamesArrays.getLetterQ()));
        namesGettersMap.put("r", getRandomValueFromArray(MaleNamesArrays.getLetterR()));
        namesGettersMap.put("s", getRandomValueFromArray(MaleNamesArrays.getLetterS()));
        namesGettersMap.put("t", getRandomValueFromArray(MaleNamesArrays.getLetterT()));
        namesGettersMap.put("u", getRandomValueFromArray(MaleNamesArrays.getLetterU()));
        namesGettersMap.put("v", getRandomValueFromArray(MaleNamesArrays.getLetterV()));
        namesGettersMap.put("w", getRandomValueFromArray(MaleNamesArrays.getLetterW()));
        namesGettersMap.put("x", getRandomValueFromArray(MaleNamesArrays.getLetterX()));
        namesGettersMap.put("y", getRandomValueFromArray(MaleNamesArrays.getLetterY()));
        namesGettersMap.put("z", getRandomValueFromArray(MaleNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(valueLetter);
    }

    public static String getRandomFemaleNameFromMapWithIntegerKey() {
        HashMap<Integer, Object> namesGettersMap = new HashMap<>();
        namesGettersMap.put(0, getRandomValueFromArray(FemaleNamesArrays.getLetterA()));
        namesGettersMap.put(1, getRandomValueFromArray(FemaleNamesArrays.getLetterB()));
        namesGettersMap.put(2, getRandomValueFromArray(FemaleNamesArrays.getLetterC()));
        namesGettersMap.put(3, getRandomValueFromArray(FemaleNamesArrays.getLetterD()));
        namesGettersMap.put(4, getRandomValueFromArray(FemaleNamesArrays.getLetterE()));
        namesGettersMap.put(5, getRandomValueFromArray(FemaleNamesArrays.getLetterF()));
        namesGettersMap.put(6, getRandomValueFromArray(FemaleNamesArrays.getLetterG()));
        namesGettersMap.put(7, getRandomValueFromArray(FemaleNamesArrays.getLetterH()));
        namesGettersMap.put(8, getRandomValueFromArray(FemaleNamesArrays.getLetterI()));
        namesGettersMap.put(9, getRandomValueFromArray(FemaleNamesArrays.getLetterJ()));
        namesGettersMap.put(10, getRandomValueFromArray(FemaleNamesArrays.getLetterK()));
        namesGettersMap.put(11, getRandomValueFromArray(FemaleNamesArrays.getLetterL()));
        namesGettersMap.put(12, getRandomValueFromArray(FemaleNamesArrays.getLetterM()));
        namesGettersMap.put(13, getRandomValueFromArray(FemaleNamesArrays.getLetterN()));
        namesGettersMap.put(14, getRandomValueFromArray(FemaleNamesArrays.getLetterO()));
        namesGettersMap.put(15, getRandomValueFromArray(FemaleNamesArrays.getLetterP()));
        namesGettersMap.put(16, getRandomValueFromArray(FemaleNamesArrays.getLetterQ()));
        namesGettersMap.put(17, getRandomValueFromArray(FemaleNamesArrays.getLetterR()));
        namesGettersMap.put(18, getRandomValueFromArray(FemaleNamesArrays.getLetterS()));
        namesGettersMap.put(19, getRandomValueFromArray(FemaleNamesArrays.getLetterT()));
        namesGettersMap.put(20, getRandomValueFromArray(FemaleNamesArrays.getLetterU()));
        namesGettersMap.put(21, getRandomValueFromArray(FemaleNamesArrays.getLetterV()));
        namesGettersMap.put(22, getRandomValueFromArray(FemaleNamesArrays.getLetterW()));
        namesGettersMap.put(23, getRandomValueFromArray(FemaleNamesArrays.getLetterX()));
        namesGettersMap.put(24, getRandomValueFromArray(FemaleNamesArrays.getLetterY()));
        namesGettersMap.put(25, getRandomValueFromArray(FemaleNamesArrays.getLetterZ()));
        return (String) namesGettersMap.get(getRandomIntFromRange(0, 25));
    }
}
