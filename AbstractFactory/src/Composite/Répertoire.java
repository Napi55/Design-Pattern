package Composite;

import java.util.ArrayList;
import java.util.List;

public class Répertoire extends Element {
	List<Element> elements;
	public Répertoire(String name) {
		super.setType("répertoire");
		super.setName(name);
		this.elements = new ArrayList<>();

		
	} 
	public void add(Element element) {
		elements.add(element);
	}
	public void remove(Element element) {
		elements.remove(element);
	}
	public Element getChild(int k) {
		return elements.get(k);
	}

	@Override
	public void description() {
	 System.out.println("type: "+this.getType()+" name: "+this.getName());
	 System.out.print("Les éléments : ");
	 
	 for(Element e : elements) {
		 
		 e.description();
		 
	 }
		
		
	}

}
