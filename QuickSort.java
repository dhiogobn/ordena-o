package quickSort;

public class QuickSort {
	
	public QuickSort() {
		
	}
	
	public static int[] quickSort(int[] vetor, int inicio, int fim) {
		int meio;
		if(inicio < fim) {
			meio = particao(vetor, inicio, fim);
			quickSort(vetor, inicio, meio);
			quickSort(vetor, meio+1, fim);
		}
		
		return vetor;
	}
	
	public static int particao(int[] vetor, int inicio, int fim) {
		int pivo, topo, i;
		pivo = vetor[inicio];
		topo = inicio;
		
		for (i = inicio+1; i <= fim; i++) {
			if(vetor[i]< pivo) {
				vetor[topo] = vetor[i];
				vetor[i] = vetor[topo+1];
				topo++;
			}
		}
		
		vetor[topo] = pivo;
		
		return topo;
		
		
	}
	
		
	

}
