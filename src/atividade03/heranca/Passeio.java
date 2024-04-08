package atividade03.heranca;

public final class Passeio extends Veiculo {

	private int qtdPassageiros;

	public Passeio() {
		this.qtdPassageiros = 0;
	}

	public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qdtRodas, Motor motor) {
		super(placa, marca, modelo, cor, velocMax, qdtRodas, motor);
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	public float calcVel(float velocNax) {
		return this.getVelocMax() * 1000;
	}
	
	@Override
	public String toString () {
		return "\n=========== VE�CULO DE PASSEIO ==========="
				+ "\nMarca: " + this.getMarca() 
				+ "\nModelo: " + this.getModelo()
				+ "\nPlaca: " + this.getPlaca()
				+ "\nCor: " + this.getCor()
				+ "\nQuantidade de Rodas: " + this.getQdtRodas()
				+ "\nVelocidade M�xima (m/h): " + String.format("%.2f",calcVel(this.getVelocMax()))
				+ "\nQuantidade de Pist�es: " + this.getMotor().getQtdPist()
				+ "\nPot�ncia do Motor: " + this.getMotor().getPotencia()
				+ "\nQuantidade de Passageiros: " + this.qtdPassageiros
				+ "\n==========================================";
	}
}
