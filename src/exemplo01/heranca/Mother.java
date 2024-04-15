package exemplo01.heranca;

public class Mother extends Parents {

	private String dressColor;

	public Mother() {
		this.dressColor = "";
	}

	public Mother(int parentsId, String parentsName, Son parentsSon, String dressColor) {
		super(parentsId, parentsName, parentsSon);
		this.dressColor = dressColor;
	}

	public String getDressColor() {
		return dressColor;
	}

	public void setDressColor(String dressColor) {
		this.dressColor = dressColor;
	}

	@Override
	public int calcId() {
		return this.getParentsId() * 100;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nMother data");
		sb.append("\nmother id: " + this.getParentsId());
		sb.append("\nmother name: " + this.getParentsName());
		sb.append("\nmother id fixed: " + String.format("%d", this.calcId()));
		sb.append("\nmother son´s id: " + this.getParentsSon().getSonId());
		sb.append("\nmother son´s name: " + this.getParentsSon().getSonName());
		sb.append("\nmother dress´s color: " + this.getDressColor() + "\n");
		return sb.toString();
	}

}
