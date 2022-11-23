package utils;

import data.namesData.rus_surnames.MaleSurnamesBank;
import utils.helper.RandomDataHelper;

public class MaleSurname {
    static MaleSurnamesBank maleSurnamesBank = new MaleSurnamesBank();
    static RandomDataHelper randomDataHelper = new RandomDataHelper();

    public static String getRandomMaleSourNameFromArrayWichStartFromLetterA(){
        return maleSurnamesBank.getSournamesFromRusLetterA()[(int) ((Math.random() * (maleSurnamesBank.getSournamesFromRusLetterA().length)))];
    }
}
