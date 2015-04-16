package pl.edu.pk.projekt1.limanowa.Model;

public abstract class Car {
	
	public CarType carType;
	public String Engine;
	public String Suspension;
	public String Wheels;
	public String Turbo;
	public String Spoiler;
	public String Springs;
	public String Reductor;
	public String Name;
	
	public abstract Car getCar();
	public abstract void setParts();
	public abstract void setExtraProperties();
	public abstract void endingOfProduction();
}
