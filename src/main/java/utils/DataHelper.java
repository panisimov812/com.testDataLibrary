package utils;

public class DataHelper {

    static NameHelper nameHelper = new NameHelper();

    public static String randomEngName() {
        return nameHelper.returnRandomMaleEngName();
    }

    public static String genderDataSelector(String genderValue) {
        return NameHelper.returnRandomNameFromAllArraysByGender(genderValue);
    }

    public static String genderAndLocalisationDataSelector(String gender, String localisation) {
        if (("male".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation))) {
            return nameHelper.returnValueByGenderAndLocalization("male", "eng");
        } else if (("male".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation))) {
            return nameHelper.returnValueByGenderAndLocalization("male", "rus");
        } else if (("female".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(localisation))) {
            return nameHelper.returnValueByGenderAndLocalization("female", "eng");
        } else if (("female".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(localisation))) {
            return nameHelper.returnValueByGenderAndLocalization("female", "rus");
        }
        return gender;
    }


}
