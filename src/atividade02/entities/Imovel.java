package atividade02.entities;

public class Imovel {

	private int valAluguel = 0;
	private String tipoMaterial = "";

	public int getValAluguel() {
		return valAluguel;
	}

	public void setValAluguel(int valAluguel) {
		this.valAluguel = valAluguel;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Override
	public String toString() {
		return "Imovel [valor do aluguel (R$)= " + String.format("%d,00", this.valAluguel) + ", tipo do material= "
				+ tipoMaterial + "]";
	}

}
