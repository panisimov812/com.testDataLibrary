package app;

import utils.helpers.DataHelper;

import static utils.helpers.DataHelper.genderAndLocalisationDataSelector;

public class LastName extends DataHelper {

    public String lastName() {
        return getRandomMaleEngLastName();
    }

    public String lastName(String genderValue) {
        return getRandomLastNameFromAllArraysByGender(genderValue);
    }

    public String lastName(String gender, String localisation) {
        return genderAndLocalisationDataSelector(gender, localisation);
    }

    public String lastNameByLetter(String letter) {
        return getValueByLetterForLastName(letter.toLowerCase());
    }
}
