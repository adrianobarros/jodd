// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd.json;

import jodd.json.mock.Address;
import jodd.json.mock.Employee;
import jodd.json.mock.Person;
import jodd.json.mock.Phone;
import jodd.json.mock.PhoneNumberType;
import jodd.json.mock.Zipcode;
import jodd.json.mock.superhero.Flight;
import jodd.json.mock.superhero.HeatVision;
import jodd.json.mock.superhero.Hero;
import jodd.json.mock.superhero.Invincible;
import jodd.json.mock.superhero.SecretIdentity;
import jodd.json.mock.superhero.SecretLair;
import jodd.json.mock.superhero.Villian;
import jodd.json.mock.superhero.XRayVision;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class DataCreator {

	public Person createJodder() {
		Address home = new Address("173 Hackers Drive", "New York", "NY", new Zipcode("123123"));
		Address work = new Address("42 Computer Center", "Earth", "Milkiway", new Zipcode("42"));

		Phone pagerPhone = new Phone(PhoneNumberType.PAGER, "123 555-1234");
		Phone cellPhone = new Phone(PhoneNumberType.MOBILE, "770 777 5432");

		Calendar cal = Calendar.getInstance();
		cal.set(1988, Calendar.NOVEMBER, 23, 8, 11);
		Person charlie = new Person("Igor", "Spasic", cal.getTime(), home, work);
		cal = Calendar.getInstance();
		cal.set(1993, Calendar.JUNE, 6, 8, 11);
		charlie.setFirstBaseBallGame(new Timestamp(cal.getTime().getTime()));
		charlie.getPhones().add(pagerPhone);
		charlie.getPhones().add(cellPhone);

		charlie.getHobbies().add("read");
		charlie.getHobbies().add("run");
		charlie.getHobbies().add("code");

		return charlie;
	}

	public Person createModesty() {
		Address benhome = new Address("NN Island", "Blue Cave", "ta", new Zipcode("82742"));
		Address benwork = new Address("44 Planetary St.", "Neptune", "Milkiway", new Zipcode("12345"));

		Calendar benCal = Calendar.getInstance();
		benCal.set(1986, Calendar.AUGUST, 8, 8, 11);
		Person ben = new Person("Modesty", "Blase", benCal.getTime(), benhome, benwork);
		benCal = Calendar.getInstance();
		benCal.set(1995, Calendar.MAY, 21, 8, 11);
		ben.setFirstBaseBallGame(new Timestamp(benCal.getTime().getTime()));
		ben.getHobbies().add("sneak");
		ben.getHobbies().add("kill");
		ben.getHobbies().add("fight");

		return ben;
	}

	public Person createPedro() {
		Zipcode pedroZip = new Zipcode("848485");
		Address pedroHome = new Address("12 Acrel\u00E8ndia Way", "Rio de Janeiro", "Brazil", pedroZip);
		Address pedroWork = new Address("12 Acrel\u00E8ndia Way", "Rio de Janeiro", "Brazil", pedroZip);

		Phone pedroPhone = new Phone(PhoneNumberType.MOBILE, "123 555 2323");

		Calendar pedroCal = Calendar.getInstance();
		pedroCal.set(1980, Calendar.APRIL, 12, 11, 45);
		Person pedro = new Person("Pedro", "Sanchez", pedroCal.getTime(), pedroHome, pedroWork);
		pedro.getPhones().add(pedroPhone);

		return pedro;
	}

	public Employee createDilbert() {
		return new Employee("Dilbert", "", new Date(),
				new Address("123 Finland Dr", "Cubicleville", "Hell", new Zipcode("66666")),
				new Address("123 Finland Dr", "Cubicleville", "Hell", new Zipcode("66666")), "Initech");
	}

	public Hero createSuperman() {
		return new Hero("Super Man",
				new SecretIdentity("Clark Kent"),
				new SecretLair("Fortress of Solitude"),
				new XRayVision(0.8f),
				new HeatVision(0.7f),
				new Flight(1000.0f),
				new Invincible());
	}

	public Villian createLexLuthor() {
		return new Villian("Lex Luthor", createSuperman(), new SecretLair("Legion of Doom"));
	}

}