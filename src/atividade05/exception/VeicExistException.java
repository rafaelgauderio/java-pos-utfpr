package atividade05.exception;

public class VeicExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public VeicExistException() {
		System.out.println("Já existe um veículo com esta Placa!");
		return;
	}

}
