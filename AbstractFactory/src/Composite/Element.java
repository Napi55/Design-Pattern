package Composite;

/**
 * 
 */
public abstract class   Element {
	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public Element() {}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void add(Element element) {
	}
	public void remove(Element element) {
	}
	public Element getChild(int k) {
		return null;
	}
	public abstract void description();

}
