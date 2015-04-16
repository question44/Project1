package pl.edu.pk.projekt1.limanowa.Model;

import pl.edu.pk.projekt1.limanowa.Patterns.Decorator;

public class OffRoadCar extends Car {

	public OffRoadCar(String name) {
		Name = name;
		carType = CarType.OFFROAD;
		setParts();
		endingOfProduction();
	}
	
	@Override
	public Car getCar() {
		return this;
	}

	@Override
	public void setParts() {
		Engine = "V8 Duramax 6.6L 305KM";
		System.out.println("\nDodano silnik: " + Engine);
		Suspension = "Twarde";
		System.out.println("Dodano zawieszenie: " + Suspension);
		Wheels = "Terenowe Michellin";
		System.out.println("Dodano opony: " + Wheels);
		Turbo = "Brak";
		System.out.println("Dodano turbo: " + Turbo);
		Spoiler = "Brak";
		System.out.println("Dodano spoiler: " + Spoiler);
		Springs = "Wzmacnianie";
		System.out.println("Dodano sprezyny: " + Springs);
		Reductor = "4x4";
		System.out.println("Dodano reduktor: " + Reductor);
		setExtraProperties();
	}

	@Override
	public void setExtraProperties() {
		System.out.println("Zwiekszono rozstaw osi");
		
	}

	@Override
	public void endingOfProduction() {
		Decorator decorator = new Decorator(this);
		decorator.createCar();
		decorator.showResults();
		
	}

	
}
