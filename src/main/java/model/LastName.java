package model;
import utils.helpers.LastNameHelper;

public class LastName extends LastNameHelper {

    public String lastName() {
        return getRandomMaleEngLastName();
    }

    public String lastName(String genderValue) {
        return getRandomLastNameFromAllArraysByGender(genderValue);
    }
//
//    public String lastName(String gender, String localisation) {
//        return genderAndLocalisationDataSelector(gender, localisation);
//    }

    public String lastNameByLetter(String letter) {
        return getValueByLetter(letter.toLowerCase());
    }
}
