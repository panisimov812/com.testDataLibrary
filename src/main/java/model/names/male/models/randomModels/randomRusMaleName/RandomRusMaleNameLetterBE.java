package model.names.male.models.randomModels.randomRusMaleName;

import data.namesData.rus.MaleNamesBankRus;
import utils.RandomDataHelper;

public class RandomRusMaleNameLetterBE extends RandomDataHelper {

    static MaleNamesBankRus maleNamesBankRus = new MaleNamesBankRus();

    public String randomRusMaleNameLetterBE() {
        return returnRandomValueFromArray(maleNamesBankRus.getLetterRusBE());
    }

}
