package Adapter;

public class implStandard implements Standard {

	@Override
	public void operation(int a,int b) {
		System.out.println("Standard, Résultat="+a*b);
		
	}

}
