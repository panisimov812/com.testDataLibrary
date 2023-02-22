package utils.value_helpers;
import static utils.data_helpers.DataHelper.*;

public class NamesValuesHelpers {

    public String getFirstName() {
        return getRandomMaleEngName();
    }

    public String getFirstName(String genderValue) {
        return getRandomNameFromAllArraysByGender(genderValue);
    }

    public String getFirstName(String gender, String localisation) {
        return genderAndLocalisationDataSelector(gender, localisation);
    }

    public String getFirstNameByLetter(String letter) {
        return getValueByLetter(letter.toLowerCase());
    }

    public String getLastName() {
        return getRandomMaleEngLastName();
    }

    public String getLastName(String genderValue) {
        return getRandomLastNameFromAllArraysByGender(genderValue);
    }

    public String getLastName(String gender, String localisation) {
        return genderAndLocalisationDataSelector(gender, localisation);
    }

    public String getLastNameByLetter(String letter) {
        return getValueByLetterForLastName(letter.toLowerCase());
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFullName(String gender) {
        return getFirstName(gender) + " " + getLastName(gender);
    }

    public String getFullName(String gender, String localisation) {
        return getFirstName(gender, localisation) + " " + getLastName(gender, localisation);
    }

    public String getFullNameInverse() {
        return getLastName() + " " + getFirstName();
    }

    public String getFullNameInverse(String gender) {
        return getLastName(gender) + " " + getFirstName(gender);

    }

    public String getFullNameInverse(String gender, String localisation) {
        return getLastName(gender, localisation) + " " + getFirstName(gender, localisation);

    }


}
