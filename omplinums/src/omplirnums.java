
public class omplirnums {

	public static void main(String[] args) {
		System.out.println ("Ivan Blasco Gascon");
		int n=5;
		int[] taula = new int[n];
		taula=omplir(n);
		int suma = sumar(taula);
		System.out.println ("La suma es: "+ suma);
		
	
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
