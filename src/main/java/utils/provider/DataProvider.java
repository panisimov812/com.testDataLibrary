package utils.provider;

import data.namesData.eng.MaleNamesBank;
import lombok.Getter;
import utils.helpers.RandomDataHelper;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static utils.helpers.RandomDataHelper.returnRandomValueFromArray;
import static utils.provider.DataProvider.getColorFromArrays;


public class DataProvider extends RandomDataHelper {
    //
//
//    public static String getRandomNameFromAllArrays(String valueLetter) {
//        HashMap<String, Object> namesGettersMap = new HashMap<>();
//        namesGettersMap.put("a", returnRandomValueFromArray(MaleNamesBank.getLetterA()));
//        namesGettersMap.put("b", returnRandomValueFromArray(MaleNamesBank.getLetterB()));
//        namesGettersMap.put("c", returnRandomValueFromArray(MaleNamesBank.getLetterC()));
//        namesGettersMap.put("d", returnRandomValueFromArray(MaleNamesBank.getLetterD()));
//        namesGettersMap.put("e", returnRandomValueFromArray(MaleNamesBank.getLetterE()));
//        namesGettersMap.put("f", returnRandomValueFromArray(MaleNamesBank.getLetterF()));
//        namesGettersMap.put("g", returnRandomValueFromArray(MaleNamesBank.getLetterG()));
//        namesGettersMap.put("h", returnRandomValueFromArray(MaleNamesBank.getLetterH()));
//        namesGettersMap.put("i", returnRandomValueFromArray(MaleNamesBank.getLetterI()));
//        namesGettersMap.put("j", returnRandomValueFromArray(MaleNamesBank.getLetterJ()));
//        namesGettersMap.put("k", returnRandomValueFromArray(MaleNamesBank.getLetterK()));
//        namesGettersMap.put("l", returnRandomValueFromArray(MaleNamesBank.getLetterL()));
//        namesGettersMap.put("m", returnRandomValueFromArray(MaleNamesBank.getLetterM()));
//        namesGettersMap.put("n", returnRandomValueFromArray(MaleNamesBank.getLetterN()));
//        namesGettersMap.put("o", returnRandomValueFromArray(MaleNamesBank.getLetterO()));
//        namesGettersMap.put("p", returnRandomValueFromArray(MaleNamesBank.getLetterP()));
//        namesGettersMap.put("q", returnRandomValueFromArray(MaleNamesBank.getLetterQ()));
//        namesGettersMap.put("r", returnRandomValueFromArray(MaleNamesBank.getLetterR()));
//        namesGettersMap.put("s", returnRandomValueFromArray(MaleNamesBank.getLetterS()));
//        namesGettersMap.put("t", returnRandomValueFromArray(MaleNamesBank.getLetterT()));
//        namesGettersMap.put("u", returnRandomValueFromArray(MaleNamesBank.getLetterU()));
//        namesGettersMap.put("v", returnRandomValueFromArray(MaleNamesBank.getLetterV()));
//        namesGettersMap.put("w", returnRandomValueFromArray(MaleNamesBank.getLetterW()));
//        namesGettersMap.put("x", returnRandomValueFromArray(MaleNamesBank.getLetterX()));
//        namesGettersMap.put("y", returnRandomValueFromArray(MaleNamesBank.getLetterY()));
//        namesGettersMap.put("z", returnRandomValueFromArray(MaleNamesBank.getLetterZ()));
//        return (String) namesGettersMap.get(valueLetter);
//    }

    @Getter
    String[] colors = new String[]{"black", "yellow", "green", "white"};

    public static String geColorByValue(String colorV) {
        return getColorFromArrays(colorV);
    }

    public static String getColorFromArrays(String color) {
        HashMap<String, String> colorsGettersMap = new HashMap<>();
        colorsGettersMap.put("black", "black");
        colorsGettersMap.put("yellow", "yellow");
        colorsGettersMap.put("green", "green");
        colorsGettersMap.put("white", "white");
        return (String) colorsGettersMap.get(color);
    }
}
class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        getColorFromArrays(String.valueOf(color));
    }
}
