package Factory;

public class EssenceFactory implements AbstractFactory {

	@Override
	public Scooter createScooter() {
	
		return new ScooterEssence();
	}

	@Override
	public Car createCar() {
		
		return new CarEssence() ;
	}

}
