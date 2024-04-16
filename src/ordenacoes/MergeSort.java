package ordenacoes;

public class MergeSort {

	public static void main(String[] args) {
		// Chama o método quicksort para ordenar o vetor
        int[] vetor = {5, 3, 8, 1, 2};
        mergeSort(vetor, 0, vetor.length - 1); //onde a ordenação do vetor é iniciada

        // Exibe o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
	}

	public static void merge(int[] a, int inicio, int meio, int fim) {
		int n = fim - inicio + 1;
		int[] b = new int[n];

		int i1 = inicio;
		int i2 = meio + 1;
		int j = 0;

		while (i1 <= meio && i2 <= fim) {
			if (a[i1] < a[i2]) {
				b[j] = a[i1];
				i1++;
			} else {
				b[j] = a[i2];
				i2++;
			}
			j++;
		}

		while (i1 <= meio) {
			b[j] = a[i1];
			i1++;
			j++;
		}

		while (i2 <= fim) {
			b[j] = a[i2];
			i2++;
			j++;
		}

		for (j = 0; j < n; j++) {
			a[inicio + j] = b[j];
		}
	}

	public static void mergeSort(int[] a, int inicio, int fim) {
		if (inicio == fim) {
			return;
		}

		int meio = (inicio + fim) / 2;
		mergeSort(a, inicio, meio);
		mergeSort(a, meio + 1, fim);
		merge(a, inicio, meio, fim);
	}
}
