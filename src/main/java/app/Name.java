package app;

import static utils.helpers.NameHelper.*;

public class Name {

    public String firstName() {
        return getRandomMaleEngName();
    }

    public String firstName(String genderValue) {
        return getRandomNameFromAllArraysByGender(genderValue);
    }

    public String firstName(String gender, String localisation) {
        return genderAndLocalisationDataSelector(gender, localisation);
    }

    public String firstNameByLetter(String letter) {
        return getValueByLetter(letter.toLowerCase());
    }



}
