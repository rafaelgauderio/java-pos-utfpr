package exemplo.heranca;

public abstract class Parents {

	private int parentsId;
	private String parentsName;
	private Son parentsSon;

	public Parents() {
		this.parentsId = 0;
		this.parentsName = "";
		this.parentsSon = new Son();
	}

	public Parents(int parentsId, String parentsName, Son parentsSon) {
		this.parentsId = parentsId;
		this.parentsName = parentsName;
		this.parentsSon = parentsSon;
	}

	public int getParentsId() {
		return parentsId;
	}

	public void setParentsId(int parentsId) {
		this.parentsId = parentsId;
	}

	public String getParentsName() {
		return parentsName;
	}

	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}

	public Son getParentsSon() {
		return parentsSon;
	}

	public void setParentsSon(Son parentsSon) {
		this.parentsSon = parentsSon;
	}

	// método abstrato não tem corpo
	// deve ser implmentado nas classes filhas
	public abstract int calcId();

}
