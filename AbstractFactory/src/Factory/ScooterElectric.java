package Factory;



public class ScooterElectric implements Scooter {
	
	public ScooterElectric() {
		this.Make();
	}

	@Override
	public void Make() {
		System.out.println("make Electric Scooter ");
		
	}

}
