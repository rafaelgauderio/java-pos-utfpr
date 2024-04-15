package exemplo01.heranca;

public class Son {
	
	private int sonId;
	private String sonName;
	
	public Son () {
		this.sonId=0;
		this.sonName = "";
	}

	public Son(int sonId, String sonName) {		
		this.sonId = sonId;
		this.sonName = sonName;
	}

	public int getSonId() {
		return sonId;
	}

	public void setSonId(int sonId) {
		this.sonId = sonId;
	}

	public String getSonName() {
		return sonName;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}	

}
