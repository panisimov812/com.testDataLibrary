package model;

import utils.helpers.DataHelper;
import utils.helpers.NameHelper;

import java.util.Locale;

public class Name extends NameHelper {
    //todo возможно следует создать наследие от класса MaleNameMap


    public String firstName() {
        return getRandomMaleEngName();
    }

    public String firstName(String genderValue) {
        return getRandomNameFromAllArraysByGender(genderValue);
    }

    public String firstName(String gender, String localisation) {
        return NameHelper.genderAndLocalisationDataSelector(gender, localisation);
    }

    public String firstNameByLetter(String letter) {
        return NameHelper.getValueByLetter(letter.toLowerCase());
    }


}
