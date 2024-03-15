package atividade02.entities;

public class Proprietario {

	private int cpfProp = 0;
	private String nomeProp = "";
	private Endereco endereco = new Endereco();

	public int getCpfProp() {
		return cpfProp;
	}

	public void setCpfProp(int cpfProp) {
		this.cpfProp = cpfProp;
	}

	public String getNomeProp() {
		return nomeProp;
	}

	public void setNomeProp(String nomeProp) {
		this.nomeProp = nomeProp;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\n\tProprietario [cpf do Proprietário= " + cpfProp + ", nome do Proprietário= " + nomeProp + "\n\tendereço do proprietário " + endereco
				+ "]";
	}

}