package exemplo01.heranca;

public class Father extends Parents {
	
	private String pantsColor;
	
	public Father () {
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
	public int calcId () {
		return this.getParentsId() * 10;
	}
	
	
	
	

}
