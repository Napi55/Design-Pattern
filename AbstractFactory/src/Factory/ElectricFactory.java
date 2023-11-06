package Factory;

public class ElectricFactory  implements AbstractFactory{

	@Override
	public Scooter createScooter() {
		
		return new ScooterElectric();
	}

	@Override
	public Car createCar() {
		
		return new CarElectric();
	}

}
