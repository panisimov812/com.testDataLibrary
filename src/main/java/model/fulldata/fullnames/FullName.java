package model.fulldata.fullnames;

import data.namesData.eng.MaleNamesBank;
import data.namesData.rus.MaleSurnamesBankRus;
import utils.RandomDataHelper;

public class FullName extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();
    static MaleSurnamesBankRus maleSurnamesBank = new MaleSurnamesBankRus();

    public String randomFullNameFromLetterA() {
        return returnRandomValuesFrom(maleNamesBank.getLetterA(),
                maleSurnamesBank.getSournamesFromRusLetterA());
    }

    public String randomFullNameFromLetterB() {
        return returnRandomValuesFrom(maleNamesBank.getLetterB(),
                maleSurnamesBank.getSournamesFromRusLetterB());
    }

    //todo корректно назвать метод
    public String randomFullName() {
        return returnRandomValuesFrom(maleNamesBank.getLetterB(),
                maleSurnamesBank.getSournamesFromRusLetterB());
    }
}
