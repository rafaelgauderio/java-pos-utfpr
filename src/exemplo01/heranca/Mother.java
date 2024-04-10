package exemplo01.heranca;

public class Mother extends Parents {

	private String dressColor;

	public Mother() {
		this.dressColor = "";
	}

	public Mother(int parentsId, String parentsName, Son parentsSon, String dressColor) {
		super(parentsId,parentsName, parentsSon);
		this.dressColor = dressColor;
	}

	public String getDressColor() {
		return dressColor;
	}

	public void setDressColor(String dressColor) {
		this.dressColor = dressColor;
	}
	
	@Override
	public int calcId () {
		return this.getParentsId() * 100;
	}
	
	

}
