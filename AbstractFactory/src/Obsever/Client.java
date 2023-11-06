package Obsever;

public class Client {

	public static void main(String[] args) {
		DataWather dataWather = new DataWather();
		DisplayMeasurements displayMeasurements = new DisplayMeasurements();
		DisplayPressure displayPressure = new DisplayPressure();
		
		dataWather.addObserver(displayPressure);
		dataWather.addObserver(displayMeasurements);
		   // Simuler des changements dans les données météorologiques
		dataWather.setMeasurements(25.0f, 50.0f, 1013.0f);
        dataWather.setMeasurements(26.0f, 55.0f, 1012.0f);

	}

}
