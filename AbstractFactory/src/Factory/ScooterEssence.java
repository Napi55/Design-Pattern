package Factory;

public class ScooterEssence implements Scooter {
	public ScooterEssence() {
		this.Make();
	}

	@Override
	public void Make() {
		System.out.println("make Essence Scooter ");
		
	}

}
