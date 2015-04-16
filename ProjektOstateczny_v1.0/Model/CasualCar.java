package pl.edu.pk.projekt1.limanowa.Model;

import pl.edu.pk.projekt1.limanowa.Patterns.Decorator;

public class CasualCar extends Car {

	public CasualCar(String name) {
		Name = name;
		carType = CarType.CASUAL;
		setParts();
		endingOfProduction();
	}
	
	@Override
	public Car getCar() {
		return this;
	}

	@Override
	public void setParts() {
		
		Engine = "Diesel 2.0 100KM";
		System.out.println("\nDodano silnik: " + Engine);
		Suspension = "Miekkie";
		System.out.println("Dodano zawieszenie: " + Suspension);
		Wheels = "Standardowe Michellin";
		System.out.println("Dodano opony: " + Wheels);
		Turbo = "Brak";
		System.out.println("Dodano turbo: " + Turbo);
		Spoiler = "Brak";
		System.out.println("Dodano spoiler: " + Spoiler);
		Springs = "Standardowe";
		System.out.println("Dodano sprezyny: " + Springs);
		Reductor = "Brak";
		System.out.println("Dodano reduktor: " + Reductor);
		setExtraProperties();
	}

	@Override
	public void setExtraProperties() {
		System.out.println("Dodane dodatkowe poduszki powietrzne");
		
	}

	@Override
	public void endingOfProduction() {
		Decorator decorator = new Decorator(this);
		decorator.createCar();
		decorator.showResults();
	}

}
