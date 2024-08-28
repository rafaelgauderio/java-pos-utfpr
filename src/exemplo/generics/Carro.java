package exemplo.generics;

class Carro {
	private String nome;
	private String placa;

	public Carro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}

class Passeio extends Carro {

	public Passeio(String nome) {
		super(nome);
	}
}

class Utilitario extends Carro {
	public Utilitario(String nome) {
		super(nome);
	}
}

class Moto {
	
	private String nome;
	
	public Moto(String nome) {
		this.nome = nome;
	}

}

class GenericsWildCard<T> {
	private T object;

	public GenericsWildCard(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	@Override
	public String toString() {
		return "GenericsWildCard [object =" + this.getObject().toString() + "]";
	}

}
