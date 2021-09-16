package examples;

import java.util.ArrayList;
import java.util.List;



public class Person {

	private final String familyName;
	private final String givenName;
	private final PersonNameStrategy nameStrategy;


	public Person(String familyName, String givenName, String nationality) {
		this(familyName, givenName, nationality, false, false);
	}

	public Person(String familyName, String givenName, String nationality,
				  boolean olympicMode, boolean capitalizeSurname) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.nameStrategy = PersonNameStrategyFactory.create(nationality, capitalizeSurname, olympicMode);
	}

	@Override
	public String toString() {
		return nameStrategy.nameString(this.familyName, this.givenName);
	}

}

