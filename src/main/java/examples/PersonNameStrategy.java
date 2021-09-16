package examples;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategy {

    static final List<String> surnameFirst = new ArrayList<String>();

    static {
        surnameFirst.add("CHN");
        surnameFirst.add("KOR");
        // etc...
    }

    private final String nationality;
    private final boolean capitalizeSurname;
    private final boolean olympicMode;

    public PersonNameStrategy(String nationality, boolean capitalizeSurname, boolean olympicMode) {

        this.nationality = nationality;
        this.capitalizeSurname = capitalizeSurname;
        this.olympicMode = olympicMode;
    }

    boolean surnameFirst() {
        if (!olympicMode)
            return false;
        return surnameFirst.contains(nationality);
    }

    String nameString(String familyName, String givenName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        if (surnameFirst())
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }
}
