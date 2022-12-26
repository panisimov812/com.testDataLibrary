package model.names.male.models.randomModels.randomRusMaleName;

import data.namesData.rus.MaleNamesBankRus;
import utils.RandomDataHelper;

public class RandomRusMaleNameLetterE extends RandomDataHelper {

    static MaleNamesBankRus maleNamesBankRus = new MaleNamesBankRus();

    public String randomRusMaleNameLetterE() {
        return returnRandomValueFromArray(maleNamesBankRus.getLetterRusE());
    }

}
