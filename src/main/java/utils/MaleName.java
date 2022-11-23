package utils;

import data.namesData.rus_names.MaleNamesBank;
import utils.helper.RandomDataHelper;

public class MaleName extends RandomDataHelper {
    static MaleNamesBank maleNamesBank = new MaleNamesBank();

    //todo переделать на return
    public void randomNameFromLetterA(){
        System.out.println(getRandomValueFromArray(maleNamesBank.getNamesFromRusLetterA()));
    }
    //todo переделать на return
    public void randomNameFromLetterB(){
        System.out.println(getRandomValueFromArray(maleNamesBank.getNamesFromRusLetterB()));
    }

    public void randomName(){
        returnRandomValueBetween(maleNamesBank.getNamesFromRusLetterB(),maleNamesBank.getNamesFromRusLetterA());
    }



}
