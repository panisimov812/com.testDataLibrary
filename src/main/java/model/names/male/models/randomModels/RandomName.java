package model.names.male.models.randomModels;

import utils.RandomDataHelper;

public class RandomName {
    RandomDataHelper randomDataHelper = new RandomDataHelper();

    public String randomEngName() {
        return randomDataHelper.returnRandomValueFromArrays();
    }


}
