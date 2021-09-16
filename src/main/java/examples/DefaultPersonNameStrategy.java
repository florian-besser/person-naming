package examples;

public class DefaultPersonNameStrategy extends PersonNameStrategy {

    protected DefaultPersonNameStrategy(boolean capitalizeSurname) {
        super(capitalizeSurname);
    }

    String nameString(String familyName, String givenName) {
        String surname = getSurname(familyName);
        return givenName + " " + surname;
    }
}
