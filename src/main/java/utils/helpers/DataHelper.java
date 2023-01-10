package utils.helpers;

public class DataHelper {

    static NameHelper nameHelper = new NameHelper();

    public static String randomEngName() {
        return nameHelper.getRandomMaleEngName();
    }

    public static String genderDataSelector(String genderValue) {
        return NameHelper.getRandomNameFromAllArraysByGender(genderValue);
    }

    //todo переделать метод с исключениме if
    public static String genderAndLocalisationDataSelector(String gender, String localisation) {
        if (("male".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation))) {
            return nameHelper.getValueByGenderAndLocalization("male", "eng");
        } else if (("male".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation))) {
            return nameHelper.getValueByGenderAndLocalization("male", "rus");
        } else if (("female".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation))) {
            return nameHelper.getValueByGenderAndLocalization("female", "eng");
        } else if (("female".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation))) {
            return nameHelper.getValueByGenderAndLocalization("female", "rus");
        }
        return gender;
    }


}
