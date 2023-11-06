package Factory;

public class CarElectric implements Car {
	public CarElectric() {
		this.Make();
		
	}
	
	
	
	@Override
	public void Make() {
		System.out.println("make Electric Car ");
		
	}


}
