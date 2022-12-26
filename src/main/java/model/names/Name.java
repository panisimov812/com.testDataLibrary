package model.names;

import model.names.male.models.randomModels.RandomName;
import model.names.male.models.randomModels.randomEngMaleName.*;
import model.names.male.models.randomModels.randomRusMaleName.*;
import utils.DataHelper;

public class Name {
    RandomName randomName = new RandomName();
    DataHelper dataHelper = new DataHelper();

    RandomMaleNameLetterA randomMaleNameLetterA = new RandomMaleNameLetterA();
    RandomMaleNameLetterB randomMaleNameLetterB = new RandomMaleNameLetterB();
    RandomMaleNameLetterC randomMaleNameLetterC = new RandomMaleNameLetterC();
    RandomMaleNameLetterD randomMaleNameLetterD = new RandomMaleNameLetterD();
    RandomMaleNameLetterE randomMaleNameLetterE = new RandomMaleNameLetterE();
    RandomMaleNameLetterF randomMaleNameLetterF = new RandomMaleNameLetterF();
    RandomMaleNameLetterG randomMaleNameLetterG = new RandomMaleNameLetterG();
    RandomMaleNameLetterH randomMaleNameLetterH = new RandomMaleNameLetterH();

    RandomRusMaleNameLetterA randomRusMaleNameLetterA = new RandomRusMaleNameLetterA();
    RandomRusMaleNameLetterBE randomRusMaleNameLetterBE = new RandomRusMaleNameLetterBE();
    RandomRusMaleNameLetterVE randomRusMaleNameLetterVE = new RandomRusMaleNameLetterVE();
    RandomRusMaleNameLetterGE randomRusMaleNameLetterGE = new RandomRusMaleNameLetterGE();
    RandomRusMaleNameLetterDE randomRusMaleNameLetterDE = new RandomRusMaleNameLetterDE();
    RandomRusMaleNameLetterE randomRusMaleNameLetterE = new RandomRusMaleNameLetterE();
    RandomRusMaleNameLetterJE randomRusMaleNameLetterJE = new RandomRusMaleNameLetterJE();

    public String firstName() {
        return randomName.randomEngName();
    }

    public String firstName(String genderValue) {
        if ((!"female".equalsIgnoreCase(genderValue)) & (!"male".equalsIgnoreCase(genderValue)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        return DataHelper.genderDataSelector(genderValue);
    }

    public String firstName(String gender, String localisation) {
        if ((!"female".equalsIgnoreCase(gender)) & (!"male".equalsIgnoreCase(gender)))
            throw new IllegalArgumentException("Enter correct value, example: male or female");
        return DataHelper.genderAndLocalisationDataSelector(gender, localisation);
    }

    public AbcName firstNameStartsWithLetter(String latter) {
        return dataHelper.letterDataSelector(latter);
    }

    public String firstNameA() {
        return randomMaleNameLetterA.randomMaleNameLetterA();
    }

    public String firstNameB() {
        return randomMaleNameLetterB.randomMaleNameLetterB();
    }

    public String firstNameC() {
        return randomMaleNameLetterC.randomMaleNameLetterC();
    }

    public String firstNameD() {
        return randomMaleNameLetterD.randomMaleNameLetterD();
    }

    public String firstNameE() {
        return randomMaleNameLetterE.randomMaleNameLetterE();
    }

    public String firstNameF() {
        return randomMaleNameLetterF.randomMaleNameLetterF();
    }

    public String firstNameG() {
        return randomMaleNameLetterG.randomMaleNameLetterG();
    }

    public String firstNameH() {
        return randomMaleNameLetterH.randomMaleNameLetterH();
    }

    //rus names

    public String firstNameRusA() {
        return randomRusMaleNameLetterA.randomRusMaleNameLetterA();
    }

    public String firstNameRusBE() {
        return randomRusMaleNameLetterBE.randomRusMaleNameLetterBE();
    }

    public String firstNameRusVE() {
        return randomRusMaleNameLetterVE.randomRusMaleNameLetterVE();
    }

    public String firstNameRusGE() {
        return randomRusMaleNameLetterGE.randomRusMaleNameLetterGE();
    }

    public String firstNameRusDE() {
        return randomRusMaleNameLetterDE.randomRusMaleNameLetterDE();
    }

    public String firstNameRusE() {
        return randomRusMaleNameLetterE.randomRusMaleNameLetterE();
    }

    public String firstNameRusJE() {
        return randomRusMaleNameLetterJE.randomRusMaleNameLetterJE();
    }

}
