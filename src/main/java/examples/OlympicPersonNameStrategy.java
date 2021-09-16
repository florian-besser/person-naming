package examples;

public class OlympicPersonNameStrategy extends PersonNameStrategy {

    private final boolean sureNameFirst;

    protected OlympicPersonNameStrategy(boolean capitalizeSurname, boolean sureNameFirst) {
        super(capitalizeSurname);
        this.sureNameFirst = sureNameFirst;
    }

    String nameString(String familyName, String givenName) {
        String surname = getSurname(familyName);
        if (sureNameFirst)
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }
}
