package model;

import data.namesData.eng.maps.MaleNamesMap;
import model.names.Names;
import utils.helpers.DataHelper;
import utils.helpers.NameHelper;
import utils.provider.DataProvider;

public class Name {
    //todo возможно следует создать наследие от класса MaleNameMap
     MaleNamesMap maleNamesMap = new MaleNamesMap();

    public String firstName() {
        return DataHelper.randomEngName();
    }

    public String firstName(String genderValue) {
        if ((!"female".equalsIgnoreCase(genderValue)) & (!"male".equalsIgnoreCase(genderValue)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        return DataHelper.genderDataSelector(genderValue);
    }

    public String firstName(String gender, String localisation) {
        if ((!"female".equalsIgnoreCase(gender)) & (!"male".equalsIgnoreCase(gender)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        if ((!"eng".equalsIgnoreCase(localisation)) & (!"rus".equalsIgnoreCase(localisation)))
            throw new IllegalArgumentException("Enter correct value, example: rus or eng");
        return DataHelper.genderAndLocalisationDataSelector(gender, localisation);
    }

    //todo метод почему то возвращает null, хотя такой же метод в классе DataProvider
    // возвращает нужное значение. Ищет по букве из мапы имя
    //Возможно вообще стоит переписать многое на мапы как и хотел заранее и сделать ее srtring object
    public String firstNameByLetter(String letter) {
        return MaleNamesMap.getValueByLetter(letter);
        //return DataProvider.getDataByValue(letter);
    }


}
