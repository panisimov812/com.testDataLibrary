package model.names.male.models.randomModels.randomRusMaleName;

import data.namesData.rus.MaleNamesBankRus;
import utils.RandomDataHelper;

public class RandomRusMaleNameLetterVE extends RandomDataHelper {

    static MaleNamesBankRus maleNamesBankRus = new MaleNamesBankRus();

    public String randomRusMaleNameLetterVE() {
        return returnRandomValueFromArray(maleNamesBankRus.getLetterRusVE());
    }

}
