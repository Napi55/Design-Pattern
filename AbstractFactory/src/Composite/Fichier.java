package Composite;

public class Fichier extends Element  {
	public Fichier(String name) {
		super.setType("Fichier");
		super.setName(name);
	}

	@Override
	public void description() {
		 System.out.println("type: "+this.getType()+" name: "+this.getName());
		
	}

}
