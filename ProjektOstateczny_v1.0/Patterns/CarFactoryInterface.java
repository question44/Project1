package pl.edu.pk.projekt1.limanowa.Patterns;
import pl.edu.pk.projekt1.limanowa.Model.Car;
import pl.edu.pk.projekt1.limanowa.Model.CarType;


public interface CarFactoryInterface {
	public Car produceCar(CarType carType, String name);
}
