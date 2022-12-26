package model.names.male.models.randomModels.randomEngMaleName;

import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomMaleNameLetterC extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();


    public String randomMaleNameLetterC() {
        return (returnRandomValueFromArray(maleNamesBank.getLetterC()));
    }

}
