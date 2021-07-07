//OPERACIONES SIMPLES 

//DAVID RIVERA ARTERO
public class UD4_OperacionesEj5App {

	public static void main(String[] args) {
		
		int A = 3;
		
		int B = 6;
		
		int C = 8;
		
		int D = 13;
	
		System.out.println("LOS VALORES INICIALES SON: " + (A) + " " + (B) + " " + (C) + " " + (D));
		
		//B TOMARA EL VALOR DE C
		B = C;
		System.out.println("AHORA EL VALOR DE B ES: " + B);
		
		//C TOMARA EL VALOR DE A
		C = A;
		System.out.println("AHORA EL VALOR DE C ES: " + C);
		
		//A TOMARA EL VALOR DE D
		A = B;
		System.out.println("AHORA EL VALOR DE A ES: " + A);
		
		//D TOMARA EL VALOR DE  B
		D = B;
		System.out.println("AHORA EL VALOR DE D ES: " + D);
		
		
		

	}

}
