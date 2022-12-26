package utils;

import model.names.AbcName;

public class DataHelper {

    static NameHelper nameHelper = new NameHelper();
    //todo изменть метод внутри на тот который будет возвращать только по гендеру
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


    public static AbcName letterDataSelector(String letter) {
        if (letter.equalsIgnoreCase("a")) return AbcName.A;
        return null;
    }

}
