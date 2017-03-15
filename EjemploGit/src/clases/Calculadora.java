package clases;

public class Calculadora {

	public int suma(int x, int y){
				System.out.println("hola");
		return (x + y);


	}
	
	public int resta(int x, int y){
		return (x - y);

	}
	public int multi(int x, int y){
		return (x * y);

	}
	public int divi(int x, int y){
		System.out.println("ESTOY DIVIDIENDO");
		if(y!=0){
			return (x / y);
		}else{
			return 0;
		}
		
	}
	
}
