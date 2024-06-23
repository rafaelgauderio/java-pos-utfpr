package atividade01.entidades;

public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private float velocMax;
	private int qtdRodas;
	private Motor motor;

	// construtor padrão
	public Veiculo() {
		this.placa = "";
		this.marca = "";
		this.modelo = "";
		this.cor = "";
		this.velocMax = 0.0f;
		this.qtdRodas = 0;
		motor = new Motor();

	}

	// construtor instanciado todos os parâmetros, menos os do motor
	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		motor = new Motor();
	}

	// construtor instanciado o Motor com os seus parâmetros
	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist,
			int potencia) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		this.motor = new Motor(qtdPist, potencia);
	}

	// construtor instanciado o motor como um Objeto Motor
	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		this.motor = motor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "\nVeículo [\nplaca= " + this.placa + "\nmarca= " + this.marca + "\nmodelo= " + this.modelo + "\ncor= "
				+ this.cor + "\nvelocidade máxima= " + String.format("%.2f km/h", this.velocMax)
				+ "\nquantidade de Rodas= " + this.qtdRodas + "\nquantidade de pistões= " + this.motor.getQtdPist()
				+ "\npotência= " + this.motor.getPotencia() + " HP\n]";
	}

}
