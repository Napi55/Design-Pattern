package Adapter;

public class implAdaptee {
	public void operation1(int a,int b){
		operation2(b*a);
		
	}
    public void operation2(int r){
    	System.out.println("Adaptée, Résultat="+r);
	}

}
