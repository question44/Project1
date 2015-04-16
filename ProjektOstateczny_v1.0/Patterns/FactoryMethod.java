package pl.edu.pk.projekt1.limanowa.Patterns;
import pl.edu.pk.projekt1.limanowa.Model.Car;
import pl.edu.pk.projekt1.limanowa.Model.CarType;
import pl.edu.pk.projekt1.limanowa.Model.CasualCar;
import pl.edu.pk.projekt1.limanowa.Model.OffRoadCar;
import pl.edu.pk.projekt1.limanowa.Model.SportCar;
import pl.edu.pk.projekt1.limanowa.Model.SuperCar;

public class FactoryMethod implements CarFactoryInterface {

	public Car produceCar(CarType carType, String name) {
		Car car = null;
		
		switch(carType) {
		
		case CASUAL:
			car = new CasualCar(name);
			break;
		case OFFROAD:
			car = new OffRoadCar(name);
			break;
		case SPORT:
			car = new SportCar(name);
			break;
		case SUPERCAR:
			car = new SuperCar(name);
			break;
		default:
			System.out.println("Niestety wystapil blad podczas produkcji samochodu dla Ciebie");
			break;
		}
		
		return car;
	}

}
