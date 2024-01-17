import java.util.ArrayList;
import java.util.List;

public class Dealership {
	
	private List<Car> carsInStore;
	
	public Dealership(){
		this.carsInStore = new ArrayList<>();
	}
	
	public void buyCar(Car car) {
		carsInStore.add(car);
		System.out.println("Car bought: " + car.toString());
		
	}
	
	public void sellCar(Car car) {
		if(carsInStore.contains(car)) {
			carsInStore.remove(car);
			System.out.println("Car sold: " + car.toString());
		}
		else {
			System.out.println("Car not found");
		}
	}
	
	public List<Car> getCarsInStore(){
		return carsInStore;
	}
}
