package atividade04.interfaces;

public final class Passeio extends Veiculo implements Calcular{

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
		return "\n=========== VEÍCULO DE PASSEIO ==========="
				+ "\nMarca: " + this.getMarca() 
				+ "\nModelo: " + this.getModelo()
				+ "\nPlaca: " + this.getPlaca()
				+ "\nCor: " + this.getCor()
				+ "\nQuantidade de Rodas: " + this.getQdtRodas()
				+ "\nVelocidade Máxima (m/h): " + String.format("%.2f",calcVel(this.getVelocMax()))
				+ "\nQuantidade de Pistões: " + this.getMotor().getQtdPist()
				+ "\nPotência do Motor: " + this.getMotor().getPotencia()
				+ "\nQuantidade de Passageiros: " + this.qtdPassageiros
				+ "\nValor calculado Interface: " + this.calcular()
				+ "\n==========================================";
	}

	@Override
	public int calcular() {
		return this.getMarca().length() + this.getModelo().length() + this.getPlaca().length() + this.getCor().length();
		
	}
}
