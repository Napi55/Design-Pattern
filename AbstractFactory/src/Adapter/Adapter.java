package Adapter;

public class Adapter extends implAdaptee implements Standard{

	@Override
	public void operation(int a, int b) {
		operation1(a, b);
		
	}

}
