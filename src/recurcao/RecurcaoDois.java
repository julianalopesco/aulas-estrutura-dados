package recurcao;

import javax.swing.JOptionPane;

public class RecurcaoDois {

    public static int calcularFatorial(int numero) {
        // Caso base: fatorial de 0 é 1
        if (numero == 0) {
            return 1;
        }
        // Caso recursivo: fatorial de n é n * fatorial(n-1)
        else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        // Solicita ao usuário o número para calcular o fatorial
        String input = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(input);

        // Verifica se o número digitado é válido (não negativo)
        if (numero >= 0) {
            int resultado = calcularFatorial(numero);
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido. Digite um número não negativo.");
        }
    }
}
