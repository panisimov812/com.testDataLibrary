package app;

import utils.value_helpers.NamesValuesHelpers;

public class TestDataApp extends NamesValuesHelpers {

    public String firstName() {
        return getFirstName();
    }

    public String firstName(String genderValue) {
        return getFirstName(genderValue);
    }

    public String firstName(String gender, String localisation) {
        return getFirstName(gender, localisation);
    }

    public String firstNameByLetter(String letter) {
        return getFirstNameByLetter(letter);
    }

    public String lastName() {
        return getLastName();
    }

    public String lastName(String genderValue) {
        return getLastName(genderValue);
    }

    public String lastName(String gender, String localisation) {
        return getLastName(gender,localisation);
    }

    public String lastNameByLetter(String letter) {
        return getLastNameByLetter(letter);
    }

    public String fullName() {
        return getFullName();
    }

    public String fullName(String gender) {
        return getFullName(gender);
    }

    public String fullName(String gender, String localisation) {
        return getFullName(gender,localisation);
    }

    public String fullNameInverse() {
        return getFullNameInverse();
    }

    public String fullNameInverse(String gender) {
        return getFullNameInverse(gender);

    }

    public String fullNameInverse(String gender, String localisation) {
        return getFullName(gender,localisation);

    }
}
