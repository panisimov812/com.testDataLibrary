package utils;

import data.namesData.eng.FemaleNamesBank;
import data.namesData.eng.MaleNamesBank;
import data.namesData.rus.FemaleNamesBankRus;
import data.namesData.rus.MaleNamesBankRus;

import java.util.Random;

public class RandomDataHelper {
    static Random random = new Random();

    public static boolean returnEvenOrOddInteger() {
        int randomInteger = random.nextInt(2);
        return (randomInteger % 2 == 0);
    }

    public static int randomInt(int startInt, int endInt) {
        return (int) (startInt + Math.random() * endInt);
    }

    public static String getRandomValueFromArray(String[] value) {
        return value[(int) ((Math.random() * (value.length)))];
    }

    public static String returnRandomValueBetween(String[] firstArray, String[] secondArray) {
        if (returnEvenOrOddInteger()) {
            return (getRandomValueFromArray(firstArray));
        } else {
            return (getRandomValueFromArray(secondArray));
        }
    }

    public String returnRandomValueFromArrays() {
        switch (randomInt(1, 7)) {
            case 1:
                return getRandomValueFromArray(MaleNamesBank.getLetterA());
            case 2:
                return getRandomValueFromArray(MaleNamesBank.getLetterB());
            case 3:
                return getRandomValueFromArray(MaleNamesBank.getLetterC());
            case 4:
                return getRandomValueFromArray(MaleNamesBank.getLetterE());
            case 5:
                return getRandomValueFromArray(MaleNamesBank.getLetterF());
            case 6:
                return getRandomValueFromArray(MaleNamesBank.getLetterG());
            case 7:
                return getRandomValueFromArray(MaleNamesBank.getLetterH());
            default:
                break;
        }

        return null;
    }

    public String returnRandomValueFromArrays(String genderValue, String localValue) {
        //количество массивов в MaleNamesBank
        int randomInteger = (int) (1 + Math.random() * 3);
        if (("male".equalsIgnoreCase(genderValue)) & ("eng".equalsIgnoreCase(localValue))) {
            switch (randomInteger) {
                case 1:
                    return getRandomValueFromArray(MaleNamesBank.getLetterA());
                case 2:
                    return getRandomValueFromArray(MaleNamesBank.getLetterB());
                case 3:
                    return getRandomValueFromArray(MaleNamesBank.getLetterC());
                case 4:
                    return getRandomValueFromArray(MaleNamesBank.getLetterE());
                default:
                    break;
            }
        } else if (("male".equalsIgnoreCase(genderValue)) & ("rus".equalsIgnoreCase(localValue)))
            switch (randomInteger) {
                case 1:
                    return getRandomValueFromArray(MaleNamesBankRus.getLetterRusA());
                case 2:
                    return getRandomValueFromArray(MaleNamesBankRus.getLetterRusBE());
                case 3:
                    return getRandomValueFromArray(MaleNamesBankRus.getLetterRusVE());
                case 4:
                    return getRandomValueFromArray(MaleNamesBankRus.getLetterRusGE());
                case 5:
                    return getRandomValueFromArray(MaleNamesBankRus.getLetterRusDE());
                default:
                    break;
            }
        else if (("female".equalsIgnoreCase(genderValue)) & ("eng".equalsIgnoreCase(localValue)))
            switch (randomInteger) {
                case 1:
                    return getRandomValueFromArray(FemaleNamesBank.getLetterA());
                case 2:
                    return getRandomValueFromArray(FemaleNamesBank.getLetterB());
            }
        else if (("female".equalsIgnoreCase(genderValue)) & ("rus".equalsIgnoreCase(localValue)))
            switch (randomInteger) {
                case 1:
                    return getRandomValueFromArray(FemaleNamesBankRus.getLetterA());
                case 2:
                    return getRandomValueFromArray(FemaleNamesBankRus.getLetterBE());
                case 3:
                    return getRandomValueFromArray(FemaleNamesBankRus.getLeterVE());
            }
        return genderValue;
    }


    public static String returnRandomValuesFrom(String[] firstArray, String[] secondArray) {
        return getRandomValueFromArray(firstArray) + " " + getRandomValueFromArray(secondArray);
    }

    //todo допистаь метод выбора случайного массива
//    public static String getRandomArrayFromClass(Class clazz) {
//        int randomInteger = (int) (1 + Math.random() * 26);
//        if (randomInteger > randomInteger-1) return clazz.get
//    }
}
