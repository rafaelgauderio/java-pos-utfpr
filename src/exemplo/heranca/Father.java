package exemplo.heranca;

public class Father extends Parents {

	private String pantsColor;

	public Father() {
		this.pantsColor = "";
	}

	public Father(int parentsId, String parentsName, Son parentsSon, String pantsColor) {
		super(parentsId, parentsName, parentsSon);
		this.pantsColor = pantsColor;
	}

	public String getPantsColor() {
		return pantsColor;
	}

	public void setPantsColor(String pantsColor) {
		this.pantsColor = pantsColor;
	}

	@Override
	public int calcId() {
		return this.getParentsId() * 10;
	}

	@Override
	public String toString() {
		return "\nFather data" + "\nfather id: " + this.getParentsId() + "\nfather name: " + this.getParentsName()
				+ "\nfather id fixed: " + String.format("%d", this.calcId()) + "\nfather son´s id: "
				+ this.getParentsSon().getSonId() + "\nfather son´s name: " + this.getParentsSon().getSonName()
				+ "\nfather pant´s color: " + this.getPantsColor() + "\n";
	}

}
