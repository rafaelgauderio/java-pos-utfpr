package atividade05.exception;

public final class Passeio extends Veiculo implements Calcular {

	private int qtdPassageiros;

	public Passeio() {
		super();
		this.qtdPassageiros = 0;
	}

	public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qdtRodas, int qtdPistao,
			int potencia, int qtdPassageiros) {
		super(placa, marca, modelo, cor, velocMax, qdtRodas, qtdPistao, potencia);
		this.qtdPassageiros = qtdPassageiros;
	}

	public final int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	public final float calcVel(float velocNax) {
		return this.getVelocMax() * 1000;
	}

	@Override
	public final String toString() {
		return "\n=========== VE�CULO DE PASSEIO ===========" + "\nMarca: " + this.getMarca() + "\nModelo: "
				+ this.getModelo() + "\nPlaca: " + this.getPlaca() + "\nCor: " + this.getCor()
				+ "\nQuantidade de Rodas: " + this.getQdtRodas() + "\nVelocidade M�xima (m/h): "
				+ String.format("%.2f", calcVel(this.getVelocMax())) + "\nQuantidade de Pist�es: "
				+ this.getMotor().getQtdPist() + "\nPot�ncia do Motor: " + this.getMotor().getPotencia()
				+ "\nQuantidade de Passageiros: " + this.qtdPassageiros + "\nValor calculado Interface: "
				+ this.calcular() + "\n==========================================";
	}

	@Override
	public final int calcular() {
		return this.getMarca().length() + this.getModelo().length() + this.getPlaca().length() + this.getCor().length();

	}
}
