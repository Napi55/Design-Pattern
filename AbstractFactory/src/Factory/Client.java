package Factory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factoryEssence = new EssenceFactory();
		AbstractFactory factoryElectric = new ElectricFactory();
		
		factoryElectric.createCar();
		factoryElectric.createScooter();
		factoryEssence.createCar();
		factoryEssence.createScooter();
		

	}

}
