package pl.edu.pk.projekt1.limanowa.Patterns;
import java.util.ArrayList;
import pl.edu.pk.projekt1.limanowa.Model.Car;

public class CarList {
	private ArrayList<Car> list;
	private int count;
	private int current;
	
	public CarList(){
		list = new ArrayList<Car>();
		count = 0;
	}
	
	public void add(Car car){
		list.add(car);
		count++;
		System.out.println("Dodano samochod do listy samochodow");
	}
	
	public void delete(Car car){
		list.remove(car);
		count--;
		System.out.println("Usunieto samochod z listy samochodow");
	}
	
	public int getSize(){
		return count;
	}
	
	public InnerIterator createIterator(){
		return new InnerIterator();
	}
	
	public class InnerIterator{
		public void first(){
			current = 0;
		}
		
		public void next(){
			if(current < count){
				++current;
			}
		}
		
		public void previous(){
			if(current > 0){
				--current;
			}
		}
		
		public boolean end(){
			return current>=count ? true : false;
		}
		
		public String currentItem(){
			return list.get(current).Name;
		}
		
	}

}
