package app;


public class FullName {
    Name name = new Name();
    LastName lastName = new LastName();

    public String fullName() {
        return name.firstName() + " " + lastName.lastName();
    }

    public String fullName(String gender) {
        return name.firstName(gender) + " " + lastName.lastName(gender);
    }

    public String fullName(String gender, String localisation) {
        return name.firstName(gender, localisation) + " " + lastName.lastName(gender, localisation);
    }

    public String fullNameInverse() {
        return lastName.lastName() + " " + name.firstName();
    }

    public String fullNameInverse(String gender) {
        return lastName.lastName(gender) + " " + name.firstName(gender);

    }

    public String fullNameInverse(String gender, String localisation) {
        return lastName.lastName(gender, localisation) + " " + name.firstName(gender, localisation);

    }
}
