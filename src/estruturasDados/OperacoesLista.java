package estruturasDados;

import java.util.ArrayList;
import java.util.List;

public class OperacoesLista {

    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionando elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Exibindo os elementos da lista
        System.out.println("Elementos da lista:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Verificando se a lista contém um elemento específico
        int elementoProcurado = 20;
        if (numeros.contains(elementoProcurado)) {
            System.out.println("A lista contém o elemento " + elementoProcurado);
        } else {
            System.out.println("A lista não contém o elemento " + elementoProcurado);
        }

        // Removendo um elemento da lista
        numeros.remove(Integer.valueOf(30));

        // Exibindo os elementos da lista após a remoção
        System.out.println("Elementos da lista após a remoção:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
