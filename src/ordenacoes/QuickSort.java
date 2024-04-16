package ordenacoes;

public class QuickSort {
//divide um array usando um pivô, colocando elementos menores
//à esquerda e maiores à direita, aplicando recursão nas partições até a ordenação completa

    public static void main(String[] args) {
        // Chama o método quicksort para ordenar o vetor
        int[] vetor = {5, 3, 8, 1, 2};
        quicksort(0, vetor.length - 1, vetor); //onde a ordenação do vetor é iniciada

        // Exibe o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quicksort(int p, int q, int vetor[]) {
        int x;

        if (p < q) {
            x = particao(p, q, vetor);
            quicksort(p, x - 1, vetor);
            quicksort(x + 1, q, vetor);
        }
    }

    public static int particao(int p, int q, int vetor[]) {
        int j = p - 1;
        int temp, aux = vetor[q];

        for (int i = p; i <= q; i++) {
            if (vetor[i] <= aux) {
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        return j;
    }
}

