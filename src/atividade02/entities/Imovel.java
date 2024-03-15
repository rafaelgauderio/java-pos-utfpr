package atividade02.entities;

public class Imovel {

	private int valAluguel = 0;
	private String tipoMaterial = "";
	private Proprietario proprietario = new Proprietario();
	private Endereco endereco = new Endereco();

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

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\n\tImóvel [valor do aluguel (R$)= " + String.format("%d,00", this.valAluguel) + ", tipo do material= "
				+ tipoMaterial + "\n\tendereço do imóvel= " + endereco + proprietario + "]";
	}

}
