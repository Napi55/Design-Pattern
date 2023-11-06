package Factory;

public class CarEssence implements Car {
	public CarEssence() {
		this.Make();
	}
	
	@Override
	public void Make() {
		System.out.println("make Essence Car ");
		
	}


}
