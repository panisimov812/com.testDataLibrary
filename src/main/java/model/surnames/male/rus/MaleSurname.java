package model.surnames.male.rus;

import data.namesData.rus.MaleSurnamesBankRus;
import utils.RandomDataHelper;

public class MaleSurname extends RandomDataHelper{
    static MaleSurnamesBankRus maleSurnamesBank = new MaleSurnamesBankRus();


    public String randomSurnameFromLetterA() {
        return (returnRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterA()));
    }

    public String randomSurnameFromLetterB() {
        return (returnRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterB()));
    }

    public String randomSurname() {
        return returnRandomValueBetween(maleSurnamesBank.getSournamesFromRusLetterB(),
                maleSurnamesBank.getSournamesFromRusLetterA());
    }

    public String randomNameFromLetterALowerCase() {
        return (returnRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterA()).toLowerCase());
    }

    public String randomNameFromLetterBLowerCase() {
        return (returnRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterB()).toLowerCase());
    }

    public String randomNameFromLetterAUpperCase() {
        return (returnRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterA()).toUpperCase());
    }

    public String randomNameFromLetterBUpperCase() {
        return (returnRandomValueFromArray(maleSurnamesBank.getSournamesFromRusLetterB()).toUpperCase());
    }
}
