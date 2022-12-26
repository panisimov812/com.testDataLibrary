package model.names.male.models.randomModels.randomEngMaleName;

import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomMaleNameLetterF extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomMaleNameLetterF() {
        return getRandomValueFromArray(maleNamesBank.getLetterF());
    }

}
