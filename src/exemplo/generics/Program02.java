package exemplo.generics;

public class Program02 {

	public static void main(String[] args) {
		
		System.out.println("Generics como tipos limitados.\n"
				+ "\tNecessário criar um superclasse da qual todos os arumentos de tipo devem derivar.\n");
		
		NumericsFunctions<Double> numerics = new NumericsFunctions<Double>(2.5);
		
		
		System.out.println("Generics to tipo number tem valor " + numerics.getNumber() );
		System.out.println("Inverso: " + numerics.inverso());
		System.out.println("Oposto: " + numerics.oposto());
		System.out.println("Fração: " + numerics.fraction());
	}

}
