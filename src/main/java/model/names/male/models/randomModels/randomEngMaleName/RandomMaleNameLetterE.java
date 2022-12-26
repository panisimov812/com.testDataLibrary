package model.names.male.models.randomModels.randomEngMaleName;

import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomMaleNameLetterE extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomMaleNameLetterE() {
        return getRandomValueFromArray(maleNamesBank.getLetterE());
    }

}
