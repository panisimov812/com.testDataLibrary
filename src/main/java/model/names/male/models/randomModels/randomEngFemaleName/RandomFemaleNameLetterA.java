package model.names.male.models.randomModels.randomEngFemaleName;

import data.namesData.eng.FemaleNamesBank;
import data.namesData.eng.MaleNamesBank;
import utils.RandomDataHelper;

public class RandomFemaleNameLetterA extends RandomDataHelper {

    static FemaleNamesBank femaleNamesBank = new FemaleNamesBank();
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    public String randomFemaleNameLetterA() {
        return returnRandomValueFromArray(femaleNamesBank.getLetterA());
    }

}
