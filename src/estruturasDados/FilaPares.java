package estruturasDados;

import javax.swing.*;

public class FilaPares { //classe principal 

    public static void main(String arg[]) {
        Fila intFila = new Fila(10); //instância da classe Fila com capacidade para 10 elementos
        int i, entrada = 0;

        for (i = 1; i <= 10; i++) { //solicita 10 números ao usuário 
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            if (entrada % 2 == 0) {
                intFila.Enfileirar(entrada); //se o número for par, ele é enfileirado usando o método Enfileirar
            }
        }

        intFila.MostrarFila(); //método para exibir os elementos da fila 
        System.exit(0);
    }
}

class Fila { //representa a estrutura de dados fila 
    int tamanho, inicio, fim, total; //atributos 
    int vetor[]; //armazena os elementos da fila 

    Fila(int tam) { //construtor que inicializa os atributos e cria o array
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new int[tam];
    }

  //métodos para verificar e editar a lista 
    
    public boolean FilaVazia() { 
        return total == 0;
    }

    public boolean FilaCheia() {
        return total >= tamanho;
    }

    public void Enfileirar(int elemento) {
        if (!FilaCheia()) {
            vetor[fim] = elemento;
            fim = fim + 1;
            total = total + 1;
            if (fim >= tamanho) {
                fim = 0;
            }
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public int Desenfileirar() {
        int desenfileirado = 0;
        if (FilaVazia()) {
            System.out.println("Fila Vazia");
        } else {
            desenfileirado = vetor[inicio];
            inicio = inicio + 1;
            total = total - 1;
            if (inicio >= tamanho) {
                inicio = 0;
            }
        }
        return desenfileirado;
    }

    public void ElementoInicio() {
        if (!FilaVazia()) {
            System.out.println("O primeiro elemento é " + vetor[inicio]);
        } else {
            System.out.println("Fila Vazia");
        }
    }

    public void MostrarFila() {
        int i, aux;
        aux = inicio;
        for (i = 1; i <= total; i++) {
            JOptionPane.showMessageDialog(null, "Elemento " + vetor[aux] + " posição " + i);
            aux = aux + 1;
            if (aux >= tamanho) {
                aux = 0;
            }
        }
    }
}
