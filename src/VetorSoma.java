
import javax.swing.*; //importa a classe JOptionPane
class VetorSoma {
public static void main(String args[]) {
	
	int VetSoma[],i, soma = 0;
	//declaração das variáveis i e soma, iniciando em 0
	
	VetSoma = new int[100];
	//construindo o vetor 
	
	for(i = 0; i <= 5; i++) {
		VetSoma [i] = Integer.parseInt(JOptionPane.showInputDialog //JOptionPane: para caixas de diálogo
				("Digite um valor inteiro"));
		soma = soma + VetSoma[i];
	}
	
	System.out.println("A soma dos 5 valores digitados é:"+soma);
	
	System.exit(0);
}
	

}
