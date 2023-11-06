package Composite;

public class Raccourci extends Element {
	public Raccourci(String name) {
		super.setType("répertoire");
		super.setName(name);
	}

	@Override
	public void description() {
		 System.out.println("type: "+this.getType()+" name: "+this.getName());
		
	}

}
