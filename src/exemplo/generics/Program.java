package exemplo.generics;

public class Program {
	
	public static void main (String [] args) {
		
		System.out.println("GENERICS\n"
				+ "\tTermo genérico refere-se a tipos parametrizados.\n"
				+ "\tPermitem criar classes onde o tipo de dado usado é especificado como parâmetro.\n"
				+ "\tA vantagem do código genérico é que ele funcionamento aumtomaticamente com qualquer tipo de dado passado.\n"
				+ "\tEvita ficar fazendo casting a todo momento.\n"
				+ "\tPropriciam segurança, porque tornam as coerções automática e implícitas."
				+ "\tParâmetro do tipo T é substituido pelo objeto do tipo real quando um objeto do tipo da classe for instanciado.\n"
				+ "\tGenerics só funcinam com tipos de referência, não");
		
		Generics <Integer> integerObject;
		Generics <Double> doubleObject = new Generics<Double>(3.1415);
		Generics <String> stringObject = new Generics<String>("Rafael de Luca");
		//Não pode usar tipo primitivo
		//Generics<int> intOnbject = new Generics<int>(1712);
		
		// autoboxing
		integerObject = new Generics<Integer>(17);
		doubleObject.setObject(6.2830);
		
		integerObject.showType();		
		System.out.println("Integer value: " + integerObject.getObject());
		
		doubleObject.showType();
		System.out.println("Double value: " + doubleObject.getObject());
		
		stringObject.showType();
		System.out.println("String value: "+ stringObject.getObject());
		
		
		
		
	}

}
