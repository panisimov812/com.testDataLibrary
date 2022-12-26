package model.fulldata.fullnames;

import java.util.HashMap;

interface FullNameTest {
    public String firstName();
}

class NamesTest implements FullNameTest {

    public static HashMap<Integer, String> letterRusA() {
        HashMap<Integer, String> letterRusATest = new HashMap<>();
        letterRusATest.put(0, "Аарон");
        letterRusATest.put(1, "Аба");
        letterRusATest.put(2, "Аббас");
        return letterRusATest;
    }

    public static String firstName(int index) {
        return letterRusA().get(index);
    }

    @Override
    public String firstName() {
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        NamesTest namesTest = new NamesTest();
        namesTest.firstName();
        System.out.println(NamesTest.firstName(2));
    }


}

