package Obsever;

public class DisplayPressure  implements Observer,Display {
	 private float pressure;
	 @Override
		public void Display() {
			   System.out.println("Affichage actuel : Pressure = " + pressure + "°");
			
		}

		@Override
		public void Update(float tempurature, float humidity, float perssure) {
			this.pressure = perssure;
		        Display();
			
		}

}
