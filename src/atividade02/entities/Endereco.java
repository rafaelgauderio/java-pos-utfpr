package atividade02.entities;

public class Endereco {

	private String rua = "";
	private int num = 0;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Endere�o [Rua= " + rua + ", n�mero= " + num + "]";
	}

}
