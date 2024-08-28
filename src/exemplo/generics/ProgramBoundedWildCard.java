package exemplo.generics;

public class ProgramBoundedWildCard {

	// limite o tipo genérico a ser apenas algum classe que estenda Carro
	static void test(GenericsWildCard<? extends Carro> object) {
		
		System.out.println(object.getObject().getNome());
		
	}

	public static void main(String[] args) {
		Carro palio = new Carro("Palio 2022");
		Passeio passat = new Passeio("Passat 2005");
		Utilitario strada = new Utilitario("Strada new Generation 2010");
		Moto titan = new Moto("Tinta 1995");

		GenericsWildCard<Carro> objectCar = new GenericsWildCard<Carro>(palio);
		GenericsWildCard<Passeio> objectVehicle = new GenericsWildCard<Passeio>(passat);
		GenericsWildCard<Utilitario> objectUtility = new GenericsWildCard<>(strada);
		GenericsWildCard<Moto> objectMotorcycle = new GenericsWildCard<Moto>(titan);
		
		test(objectCar);
		test(objectVehicle);
		test(objectUtility);
		// erro de compilação, motor não estende de Carro e o WilCard foi limitado a estender de Carro
		//test(objectMotorcycle);
	}
	
	

}
