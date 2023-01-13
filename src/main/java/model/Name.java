package model;

import data.namesData.eng.maps.MaleEngNamesMap;
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
        if ((!"female".equalsIgnoreCase(gender)) & (!"male".equalsIgnoreCase(gender)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        if ((!"eng".equalsIgnoreCase(localisation)) & (!"rus".equalsIgnoreCase(localisation)))
            throw new IllegalArgumentException("Enter correct value, example: rus or eng");
        return DataHelper.genderAndLocalisationDataSelector(gender, localisation);
    }

    public String firstNameByLetter(String letter) {
        return NameHelper.getValueByLetter(letter.toLowerCase());
    }


}
