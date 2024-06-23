package atividade03.heranca;

public abstract class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private float velocMax;
	private int qdtRodas;
	private Motor motor;

	public Veiculo() {

		this.placa = "";
		this.marca = "";
		this.modelo = "";
		this.cor = "";
		this.velocMax = 0.0f;
		this.qdtRodas = 0;
		this.motor = new Motor();
	}

	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qdtRodas, int qtdPistao,
			int potencia) {

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qdtRodas = qdtRodas;
		this.motor = new Motor(qtdPistao, potencia);
	}

	public String getPlaca() {
		return placa;
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public final void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public int getQdtRodas() {
		return qdtRodas;
	}

	public final void setQdtRodas(int qdtRodas) {
		this.qdtRodas = qdtRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public final void setMotor(Motor motor) {
		this.motor = motor;
	}

	// método abstrato não tem corpo
	// deve ser implementado nas classes filhas
	public abstract float calcVel(float velocMax);

}
