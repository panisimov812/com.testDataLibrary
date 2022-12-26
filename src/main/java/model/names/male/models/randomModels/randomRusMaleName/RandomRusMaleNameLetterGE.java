package model.names.male.models.randomModels.randomRusMaleName;

import data.namesData.rus.MaleNamesBankRus;
import utils.RandomDataHelper;

public class RandomRusMaleNameLetterGE extends RandomDataHelper {

    static MaleNamesBankRus maleNamesBankRus = new MaleNamesBankRus();

    public String randomRusMaleNameLetterGE() {
        return returnRandomValueFromArray(maleNamesBankRus.getLetterRusGE());
    }

}
