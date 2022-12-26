package model.surnames.male.rus;

import data.namesData.rus.MaleSurnamesBankRus;
import utils.RandomDataHelper;

public class MaleSurname extends RandomDataHelper{
    static MaleSurnamesBankRus maleSurnamesBank = new MaleSurnamesBankRus();


    public String randomSurnameFromLetterA() {
        return (getRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterA()));
    }

    public String randomSurnameFromLetterB() {
        return (getRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterB()));
    }

    public String randomSurname() {
        return returnRandomValueBetween(maleSurnamesBank.getSournamesFromRusLetterB(),
                maleSurnamesBank.getSournamesFromRusLetterA());
    }

    public String randomNameFromLetterALowerCase() {
        return (getRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterA()).toLowerCase());
    }

    public String randomNameFromLetterBLowerCase() {
        return (getRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterB()).toLowerCase());
    }

    public String randomNameFromLetterAUpperCase() {
        return (getRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterA()).toUpperCase());
    }

    public String randomNameFromLetterBUpperCase() {
        return (getRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterB()).toUpperCase());
    }
}
