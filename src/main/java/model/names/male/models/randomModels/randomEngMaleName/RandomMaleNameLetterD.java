package model.names.male.models.randomModels.randomEngMaleName;

import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomMaleNameLetterD extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomMaleNameLetterD() {
        return getRandomValueFromArray(maleNamesBank.getLetterD());
    }

}
