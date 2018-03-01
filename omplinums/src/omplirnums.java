
public class omplirnums {

	public static void main(String[] args) {
		int n=5;
		int[] taula = new int[n];
		taula=omplir(n);
		int suma = sumar(taula);
		System.out.println ("La suma es: "+ suma);
		System.out.println ("jesus");
		System.out.print("Miguel Enrique Borras");
	
	}
	private static int[] omplir(int n) {
		int[] taula = new int [n];
		for (int i=0; i<n; i++)
			taula[i] = i * 10;
		return taula;
	}
	private static int sumar(int[] taula){
		int suma = 0;
		int n= taula.length;
		for (int i=0; i<n; i++)
			suma =  suma + taula[i];
		return suma;
	}

}
