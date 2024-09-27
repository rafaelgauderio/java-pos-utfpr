package exemplo.generics;

 interface IGenericsIF<T, V extends T> {

}
 
 // um classe que implement uma interface genérica também deve ser genérica
 class MyClass<T, V extends T> implements IGenericsIF<T,V> {
	 
 }


