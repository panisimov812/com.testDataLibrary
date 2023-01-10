package model.names;

public interface Names {
    public String firstName();

    void firstName(String genderValue);

    void firstName(String gender, String localisation);

    void firstNameByLetter(String letter);

}
