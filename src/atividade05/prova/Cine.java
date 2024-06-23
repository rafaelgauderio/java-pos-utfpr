package atividade05.prova;

public final class Cine extends Point implements Verifica {

	private int qtdCad = 0;
	private Lanche lanche = new Lanche();

	public int getQtdCad() {
		return qtdCad;
	}

	public void setQtdCad(int qtdCad) {
		this.qtdCad = qtdCad;
	}

	public Lanche getLanche() {
		return lanche;
	}

	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}

	@Override
	public void calcVal() {
		System.out.println(String.format("Valor do lanche R$ %d,00", lanche.getValConta() + 10));
	}

	@Override
	public void validar() {
		if (this.getEnder().getRua().length() >=10 && this.getEnder().getRua().length() <= 35) {
			System.out.println("Nome de rua VALIDO para Cine!");
		} else {
			System.out.println("Nome de rua INVALIDO para Cine!");
		}

	}

}
