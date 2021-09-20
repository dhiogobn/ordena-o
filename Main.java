package quickSort;

public class Main {
	private static final int INICIO = 0;

	public static void main(String[] args) {
		
		int[] numeros = new int[] {120, 1, 9, 3, 7, 2};
		QuickSort.quickSort(numeros, INICIO, numeros.length-1);
		
		for (int i : numeros) {
			System.out.print(i);
		}
		
	}
}
