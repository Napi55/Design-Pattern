package Obsever;

public class DisplayMeasurements implements Observer,Display {
	private float temperature;
    private float humidity;

	@Override
	public void Display() {
		   System.out.println("Affichage actuel : Température = " + temperature + "°C, Humidité = " + humidity + "%");
		
	}

	@Override
	public void Update(float tempurature, float humidity, float perssure) {
		  this.temperature = tempurature;
	        this.humidity = humidity;
	        Display();
		
	}

}
