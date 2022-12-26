package utils;

import data.namesData.eng.MaleNamesBank;
import data.namesData.rus.MaleNamesBankRus;
import model.names.AbcName;
import model.names.male.models.randomModels.RandomName;

public class DataHelper {
    static RandomName randomName = new RandomName();
    static MaleNamesBankRus maleNamesBankRus = new MaleNamesBankRus();
    static MaleNamesBank maleNamesBank = new MaleNamesBank();
    static RandomDataHelper randomDataHelper = new RandomDataHelper();


    public static String genderDataSelector(String genderValue) {
        return randomDataHelper.returnRandomValueFromArrays(genderValue, "eng");
    }

    public static String genderAndLocalisationDataSelector(String gender, String language) {
        if (("male".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(language))) {
            return randomDataHelper.returnRandomValueFromArrays("male", "eng");
        } else if (("male".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(language))) {
            return randomDataHelper.returnRandomValueFromArrays("male", "rus");
        } else if (("female".equalsIgnoreCase(gender)) & ("eng".equalsIgnoreCase(language))) {
            return randomDataHelper.returnRandomValueFromArrays("female", "eng");
        } else if (("female".equalsIgnoreCase(gender)) & ("rus".equalsIgnoreCase(language))) {
            return randomDataHelper.returnRandomValueFromArrays("female", "rus");
        }
        return gender;
    }


    public static AbcName letterDataSelector(String letter) {
        if (letter.equalsIgnoreCase("a")) return AbcName.A;
        return null;
    }

}
