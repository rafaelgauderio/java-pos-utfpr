package exemplo.generics;

 interface IGenericsIF<T, V extends T> {

}
 
 // um classe que implement uma interface gen�rica tamb�m deve ser gen�rica
 class MyClass<T, V extends T> implements IGenericsIF<T,V> {
	 
 }


