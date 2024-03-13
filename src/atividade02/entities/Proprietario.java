package atividade02.entities;

import java.text.NumberFormat;

public class Proprietario {	

	private int cpfProp = 0;
	private String nomeProp = "";

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
		

	@Override
	public String toString() {
		return "Proprietario [cpf do Proprietário= " + cpfProp + ", nome do Proprietário= " + nomeProp
				+ "]";
	}

}