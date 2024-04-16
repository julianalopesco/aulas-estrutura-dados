package ordenacoes;

public class BubbleSort {
    // O algoritmo do Bubble Sort compara pares de elementos adjacentes 
	//em um array e os troca de posição se estiverem fora de ordem. 
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 2}; // Array de números desordenados
        
/*int[] numeros = new int[5]; // Cria um array de 5 elementos para armazenar os números digitados

        System.out.println("Digite 5 números para serem ordenados:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Lê um número digitado pelo usuário
        }

        scanner.close(); // Fecha o Scanner após a leitura dos números*/

        System.out.println("Array antes da ordenação:");
        exibirArray(numeros);

        ordenarBubbleSort(numeros); // Chamando o método para ordenar o array

        System.out.println("\nArray depois da ordenação:");
        exibirArray(numeros);
    }

    public static void ordenarBubbleSort(int numeros[]) {
        final int n = numeros.length;
        int aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }

    public static void exibirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

