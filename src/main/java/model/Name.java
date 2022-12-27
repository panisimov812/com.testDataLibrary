package model;

import model.names.Names;
import utils.DataHelper;
import utils.NameHelper;

public class Name implements Names {

    public String firstName() {
        return DataHelper.randomEngName();
    }

    public String firstName(String genderValue) {
        if ((!"female".equalsIgnoreCase(genderValue)) & (!"male".equalsIgnoreCase(genderValue)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        return DataHelper.genderDataSelector(genderValue);
    }

    public String firstName(String gender, String localisation) {
        if ((!"female".equalsIgnoreCase(gender)) & (!"male".equalsIgnoreCase(gender)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        if ((!"eng".equalsIgnoreCase(localisation)) & (!"rus".equalsIgnoreCase(localisation)))
            throw new IllegalArgumentException("Enter correct value, example: rus or eng");
        return DataHelper.genderAndLocalisationDataSelector(gender, localisation);
    }

    public String firstNameByLetter(String letter) {
        return NameHelper.returnNameByLetter(letter);
    }


}
