package pl.edu.pk.projekt1.limanowa.Model;

import pl.edu.pk.projekt1.limanowa.Patterns.Decorator;

public class SuperCar extends Car {

	public SuperCar(String name) {
		Name = name;
		carType = CarType.SUPERCAR;
		setParts();
		endingOfProduction();
	}
	
	@Override
	public Car getCar() {
		return this;
	}

	@Override
	public void setParts() {
		Engine = "\nBenzynowy V10 5.5L 700KM";
		System.out.println("Dodano silnik: " + Engine);
		Suspension = "Twarde";
		System.out.println("Dodano zawieszenie: " + Suspension);
		Wheels = "Sportowe Pirelli z szerokimi felgami";
		System.out.println("Dodano opony: " + Wheels);
		Turbo = "Dwie turbosprezarki";
		System.out.println("Dodano turbo: " + Turbo);
		Spoiler = "Tylni i przedni";
		System.out.println("Dodano spoiler: " + Spoiler);
		Springs = "Sportowe";
		System.out.println("Dodano sprezyny: " + Springs);
		Reductor = "Brak";
		System.out.println("Dodano reduktor: " + Reductor);
		setExtraProperties();
	}

	@Override
	public void setExtraProperties() {
		System.out.println("Maxymalnie obnizono zawieszenie");
	}

	@Override
	public void endingOfProduction() {
		Decorator decorator = new Decorator(this);
		decorator.createCar();
		decorator.showResults();
	}

}
