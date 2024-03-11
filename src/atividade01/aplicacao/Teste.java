package atividade01.aplicacao;

import atividade01.entidades.Veiculo;

public class Teste {

	public static void main(String[] args) {

		// instanciando objeto Veiculo sem dados algum
		Veiculo v1 = new Veiculo();
		System.out.println(v1);

		// instanciando com todos os parâmetros
		Veiculo v2 = new Veiculo("dok2891", "Fiat Marea", "Sedan", "preto", 250, 4, 6, 128);
		System.out.println(v2);

		// instanciado objeto sem os parâmetros do motor
		Veiculo v3 = new Veiculo("joh9278", "Volkswagen Golf", "Hatch", "azul", 220, 4);
		v3.getMotor().setQtdPist(6);
		v3.getMotor().setPotencia(110);
		System.out.println(v3);

		// setando tudo pelos métodos set
		Veiculo v4 = new Veiculo();
		v4.setPlaca("iov6514");
		v4.setMarca("Renault Jepe Renegade");
		v4.setModelo("SUV");
		v4.setCor("Rosa");
		v4.setVelocMax(190.5f);
		v4.setQtdRodas(4);
		v4.getMotor().setQtdPist(4);
		v4.getMotor().setPotencia(90);
		System.out.println(v4.toString());

		Veiculo v5 = new Veiculo("ukl7544", "Honda Titan", "Moto", "verde", 120.8f, 2);
		v5.getMotor().setQtdPist(1);
		v5.getMotor().setPotencia(50);
		// usando métodos gets para imprimir o objeto v5
		System.out.println("\nVeículo");
		System.out.println("Placa= " + v5.getPlaca());
		System.out.println("Marca= " + v5.getMarca());
		System.out.println("Modelo= " + v5.getModelo());
		System.out.println("Cor= " + v5.getCor());
		System.out.println("Velocidade máxima= " + String.format("%.2f km/h", v5.getVelocMax()));
		System.out.println("Quantidade de rodas= " + v5.getQtdRodas());
		System.out.println("Quantidade de pistões= " + v5.getMotor().getQtdPist());
		System.out.println("Potência= " + v5.getMotor().getPotencia() + " HP");
	}

}
