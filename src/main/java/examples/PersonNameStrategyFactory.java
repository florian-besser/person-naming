package examples;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategyFactory {

    private static final List<String> surnameFirst = new ArrayList<String>();

    static {
        surnameFirst.add("CHN");
        surnameFirst.add("KOR");
        // etc...
    }

    public static PersonNameStrategy create(String nationality, boolean capitalizeSurname, boolean olympicMode) {
        if (olympicMode) {
            return new OlympicPersonNameStrategy(capitalizeSurname, surnameFirst.contains(nationality));
        }
        return new DefaultPersonNameStrategy(capitalizeSurname);
    }
}
