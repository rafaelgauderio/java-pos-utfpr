package atividade05.prova;

public class Lanche extends Point implements Verifica {

	private String prato = "";

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	@Override
	public void validar() {
		System.out.println(this.getPrato().charAt(0));

	}

	@Override
	public void calcVal() {
		
		if (this.getValConta() % 2 != 0 ) {
			System.out.println("Valor ímpar!");
		} else {
			System.out.println("Valor par!");
		}
			

	}

}
