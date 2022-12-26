package model.names.male.models.randomModels.randomEngMaleName;

import utils.RandomDataHelper;

import data.namesData.eng.MaleNamesBank;


public class RandomMaleNameLetterB extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomMaleNameLetterB() {
        return (returnRandomValueFromArray(maleNamesBank.getLetterB()));
    }

}
