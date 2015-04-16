package pl.edu.pk.projekt1.limanowa.Patterns;
import java.util.ArrayList;

import pl.edu.pk.projekt1.limanowa.Model.Car;

public class Decorator implements CarDecoratorInterface {

	private Car car;
	private ArrayList<String> taskList = new ArrayList<String>();
	
	public Decorator(Car car) {
		this.car = car;
	}

	public void createCar() {
		System.out.println("\nSamochod "+ car.Name + " przystepuje do koncowej fazy produkcji");
		taskList.add("Dodano nadwozie");
		taskList.add("Dodano karoserie");
		taskList.add("Dodano fotele");
		taskList.add("Dodano klimatyzjace");
		taskList.add("Dodano dodatki");
		taskList.add("Dodano kolor\n");
	}

	public void showResults() {
		for(String s : taskList) {
			System.out.println(s);
		}
		System.out.println("Twoj samochod o typie: "+car.carType + " i nazwie: "+ car.Name + " jest gotowy do uzycia, rzyczymy udanego uzytkowania!");
		System.out.println();
	}
}
