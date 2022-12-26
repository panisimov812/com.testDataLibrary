package model.names.male.models.randomModels.randomRusMaleName;

import data.namesData.rus.MaleNamesBankRus;
import utils.RandomDataHelper;

public class RandomRusMaleNameLetterJE extends RandomDataHelper {

    static MaleNamesBankRus maleNamesBankRus = new MaleNamesBankRus();

    public String randomRusMaleNameLetterJE() {
        return returnRandomValueFromArray(maleNamesBankRus.getLetterRusJE());
    }

}
