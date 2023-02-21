package app;

import static utils.helpers.DataHelper.*;

public class Name{

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


//todo Создал интерфейс от которого я хочу унаследовать два метода имя и фамилия, для создания одного единого лкасса фулл наейм
//todo сделать единый класс чтобы от него начинать отдавать тестовые данные
}
