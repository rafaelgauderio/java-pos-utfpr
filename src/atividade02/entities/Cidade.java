package atividade02.entities;

public class Cidade {

	private int codCid = 0;
	private String nomeCid = "";

	public int getCodCid() {
		return codCid;
	}

	public void setCodCid(int codCid) {
		this.codCid = codCid;
	}

	public String getNomeCid() {
		return nomeCid;
	}

	public void setNomeCid(String nomeCid) {
		this.nomeCid = nomeCid;
	}

	@Override
	public String toString() {
		return ", Cidade [código da Cidade= " + codCid + ", nome da Cidade= " + nomeCid + "]";
	}

}