package examples;

public abstract class PersonNameStrategy {

    private final boolean capitalizeSurname;

    protected PersonNameStrategy(boolean capitalizeSurname) {
        this.capitalizeSurname = capitalizeSurname;
    }

    protected String getSurname(String familyName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        return surname;
    }

    abstract String nameString(String familyName, String givenName);
}