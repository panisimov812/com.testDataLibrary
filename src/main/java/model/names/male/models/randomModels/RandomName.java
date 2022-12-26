package model.names.male.models.randomModels;

import utils.NameHelper;
import utils.RandomDataHelper;

public class RandomName {
    RandomDataHelper randomDataHelper = new RandomDataHelper();
    NameHelper nameHelper = new NameHelper();

    public String randomEngName() {
        return nameHelper.returnRandomMaleEngName();
    }


}
