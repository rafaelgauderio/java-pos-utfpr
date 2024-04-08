package atividade03.heranca;

public final class Carga extends Veiculo {

	private int cargaMax;
	private int tara;

	public Carga() {
		super();
		this.cargaMax = 0;
		this.tara = 0;
	}

	public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qdtRodas, int qtdPistao,
			int potencia, int cargaMax, int tara) {
		super(placa, marca, modelo, cor, velocMax, qdtRodas, qtdPistao, potencia);
		this.cargaMax = cargaMax;
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public float calcVel(float velocMax) {
		return velocMax * 100000;

	}

	public String toString() {
		return "\n=========== VEÍCULO DE CARGA ==========="
				+ "\nMarca: " + this.getMarca()
				+ "\nModelo: "+ this.getModelo()
				+ "\nPlaca: " + this.getPlaca()
				+ "\nCor: " + this.getCor()
				+ "\nQuantidade de Rodas: " + this.getQdtRodas() 
				+ "\nVelocidade Máxima (cm/h): " + String.format("%.2f", calcVel(this.getVelocMax()))
				+ "\nQuantidade de Pistões: " + this.getMotor().getQtdPist()
				+ "\nPotência do Motor: " + this.getMotor().getPotencia()
				+ "\nCarga máxima: " + this.cargaMax
				+ "\nTara: " + this.tara
				+ "\n==========================================";
	}

}
