package exemplo.generics;

public class Program {
	
	public static void main (String [] args) {
		
		System.out.println("GENERICS\n"
				+ "\tTermo gen�rico refere-se a tipos parametrizados.\n"
				+ "\tPermitem criar classes onde o tipo de dado usado � especificado como par�metro.\n"
				+ "\tA vantagem do c�digo gen�rico � que ele funcionamento aumtomaticamente com qualquer tipo de dado passado.\n"
				+ "\tEvita ficar fazendo casting a todo momento.\n"
				+ "\tPropriciam seguran�a, porque tornam as coer��es autom�tica e impl�citas.\n"
				+ "\tPar�metro do tipo T � substituido pelo objeto do tipo real quando um objeto do tipo da classe for instanciado.\n"
				+ "\tGenerics s� funcinam com tipos de refer�ncia, n�o funcionam com tipo primitivos.\n"
				+ "\tTipos Gen�ricos diferem de acordo com seus tipos de argumento.\n"
				+ "\tTipos limitados: os par�metros de tipo podem ser substituidos por qualquer tipo de classe.\n"
				+ "\tInterfaces tamb�m podem ser declarados do tipo generics.\n");
		
		//Generics X = new Generics(); // n�o pode ser instanciado assim, tem que deficinir o tipo
		Generics <Integer> integerObject;
		Generics <Double> doubleObject = new Generics<Double>(3.1415);
		Generics <String> stringObject = new Generics<String>("Rafael de Luca");
		//N�o pode usar tipo primitivo
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
		
		System.out.println("\nGenerics com 2 par�metros");
		GenericsTwoParams<String, Integer> genericsTwo = new GenericsTwoParams<String, Integer>("Rafael de Luca", 41);
		GenericsTwoParams<String, Integer> genericsTwoSimplified = new GenericsTwoParams<>("Rafael de Luca", 41);
		
		String nome = genericsTwo.getObject01();
		int idade = genericsTwo.getObject02();
		
		genericsTwo.showTypes();
		System.out.println("Nome: " + nome + ", idade:" +idade);
				
	}

}
