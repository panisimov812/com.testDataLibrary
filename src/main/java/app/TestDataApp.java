package app;

import static utils.helpers.DataHelper.*;
import static utils.helpers.DataHelper.getValueByLetter;

public class TestDataApp {

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

    public String fullName() {
        return firstName() + " " + this.lastName();
    }

    public String fullName(String gender) {
        return this.firstName(gender) + " " + this.lastName(gender);
    }

    public String fullName(String gender, String localisation) {
        return this.firstName(gender, localisation) + " " + this.lastName(gender, localisation);
    }

    public String fullNameInverse() {
        return lastName() + " " + firstName();
    }

    public String fullNameInverse(String gender) {
        return lastName(gender) + " " + firstName(gender);

    }

    public String fullNameInverse(String gender, String localisation) {
        return lastName(gender, localisation) + " " + firstName(gender, localisation);

    }
}
