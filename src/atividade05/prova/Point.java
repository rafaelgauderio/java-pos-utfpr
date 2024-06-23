package atividade05.prova;

public abstract class Point {

	private String nome = "";
	private int valConta = 0;
	private Endereco ender = new Endereco();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValConta() {
		return valConta;
	}

	public void setValConta(int valConta) {
		this.valConta = valConta;
	}

	public Endereco getEnder() {
		return ender;
	}

	public void setEnder(Endereco ender) {
		this.ender = ender;
	}
	
	public abstract void calcVal ();

}
