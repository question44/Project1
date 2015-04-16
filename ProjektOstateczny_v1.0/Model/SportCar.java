package pl.edu.pk.projekt1.limanowa.Model;

import pl.edu.pk.projekt1.limanowa.Patterns.Decorator;

public class SportCar extends Car {

	public SportCar(String name) {
		Name = name;
		carType = CarType.SPORT;
		setParts();
		endingOfProduction();
	}
	
	
	@Override
	public Car getCar() {
		return this;
	}


	@Override
	public void setParts() {
		Engine = "V8 200KM 3.2L";
		System.out.println("\nDodano silnik: " + Engine);
		Suspension = "Twarde";
		System.out.println("Dodano zawieszenie: " + Suspension);
		Wheels = "Sportowe Pirelli";
		System.out.println("Dodano opony: " + Wheels);
		Turbo = "Jedna turbosprezarka";
		System.out.println("Dodano turbo: " + Turbo);
		Spoiler = "Tylni spoiler";
		System.out.println("Dodano spoiler: " + Spoiler);
		Springs = "Sportowe";
		System.out.println("Dodano sprezyny: " + Springs);
		Reductor = "Brak";
		System.out.println("Dodano reduktor: " + Reductor);
		setExtraProperties();
	}


	@Override
	public void setExtraProperties() {
		System.out.println("Zainstalowano podtlenek azotu");
	}


	@Override
	public void endingOfProduction() {
		Decorator decorator = new Decorator(this);
		decorator.createCar();
		decorator.showResults();
		
	}
}
