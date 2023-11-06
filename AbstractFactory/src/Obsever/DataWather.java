package Obsever;

import java.util.ArrayList;
import java.util.List;

public class DataWather implements Subject {
	 private List<Observer> observers;
	    private float temperature;
	    private float humidity;
	    private float pressure;

	    public DataWather() {
	        observers = new ArrayList<>();
	    }

	@Override
	public void addObserver(Observer observer) {
	  observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.humidity=humidity;
		this.temperature=temperature;
		this.pressure=pressure;
		Notify();
	}

	@Override
	public void Notify() {
		for(Observer o : observers)
		{
			
			o.Update(temperature, humidity, pressure);
		}
	}

}
