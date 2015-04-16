package pl.edu.pk.projekt1.limanowa;

import java.util.Scanner;

import pl.edu.pk.projekt1.limanowa.Model.Car;
import pl.edu.pk.projekt1.limanowa.Model.CarType;
import pl.edu.pk.projekt1.limanowa.Patterns.CarFactoryInterface;
import pl.edu.pk.projekt1.limanowa.Patterns.CarList;
import pl.edu.pk.projekt1.limanowa.Patterns.FactoryMethod;
import pl.edu.pk.projekt1.limanowa.Patterns.CarList.InnerIterator;

public class Main {

	public static void main(String[] args) {
		
			boolean nextClient = false;
			int choose = 0;
			String name = "";
			String next = "f";
			CarList carList = new CarList();
			do{
				Scanner chooseReader = new Scanner(System.in);
				Scanner nameReader = new Scanner(System.in);
				System.out.println("Witaj szanowny kliencie, jaki typ samochodu chcesz abysmy dla Ciebie wyprodukowali?");
				System.out.println(" 1) Sportowy\n 2) Na codzien \n 3) Terenowy \n 4) Super samochod\nProsze podac numer: ");
				choose = chooseReader.nextInt();
				
				if(choose>= 1 && choose <= 4) {
				
					System.out.println("Dziekuje, teraz podaj swoją wymarzoną nazwę dla Twojego samochodu: ");
					name = nameReader.nextLine();
					
					CarFactoryInterface factory = new FactoryMethod();
					Car car = null;
					switch(choose) {
					case 1:
						car = factory.produceCar(CarType.SPORT, name).getCar();
						break;
					case 2:
						car = factory.produceCar(CarType.CASUAL, name).getCar();
						break;
					case 3:
						car = factory.produceCar(CarType.OFFROAD, name).getCar();
						break;
					case 4:
						car = factory.produceCar(CarType.SUPERCAR, name).getCar();
						break;
					default:
						System.out.println("Wybrales niepoprawna opcje");
						break;
					}
					carList.add(car);
				}
				else
				{
					System.out.println("Nie ma takiego typu samochodu, dziekujemy za probe skorzystania");
				}
				
				System.out.println("\nCzy mamy nastepnego klienta (t/n)?");
				Scanner nc = new Scanner(System.in);
				next = nc.nextLine(); 
				if(next.equals("t")){
					nextClient = true;
				}
				else{
					nextClient = false;
				}
				
			}while(nextClient);
			
			System.out.println("Oto lista wyprodukowanych samochodow: ");
			InnerIterator iter = carList.createIterator();
			while(!iter.end()){
				System.out.println(iter.currentItem());
				iter.next();
			}
	}

}


