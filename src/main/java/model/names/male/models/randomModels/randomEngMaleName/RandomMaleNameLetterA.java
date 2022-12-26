package model.names.male.models.randomModels.randomEngMaleName;

import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomMaleNameLetterA extends RandomDataHelper {

    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomMaleNameLetterA() {
        return returnRandomValueFromArray(maleNamesBank.getLetterA());
    }

}
