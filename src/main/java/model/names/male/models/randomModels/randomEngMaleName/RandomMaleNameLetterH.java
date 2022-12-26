package model.names.male.models.randomModels.randomEngMaleName;

import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomMaleNameLetterH extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomMaleNameLetterH() {
        return returnRandomValueFromArray(maleNamesBank.getLetterH());
    }

}
