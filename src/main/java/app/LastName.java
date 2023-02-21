package app;

import static utils.helpers.DataHelper.*;

public class LastName {


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
