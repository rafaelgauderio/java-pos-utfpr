package atividade05.prova;

public final class Endereco {

	private int num = 0;
	private String rua = "";

	public int getNum() {
		return num;
	}

	public void setNum(int num) throws NumException {
		if (num <= 1000) {
			this.num = num;
		} else {
			throw new NumException();
		}
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}
