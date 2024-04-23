package estruturasDados;


	// Definição da classe para representar um nó da árvore
	class No {
	    int valor;
	    No esquerda;
	    No direita;

	    // Construtor para criar um novo nó com valor
	    public No(int valor) {
	        this.valor = valor;
	        this.esquerda = null;
	        this.direita = null;
	    }
	}

	// Classe para representar a árvore binária
	class ArvoreBinaria {
	    No raiz;

	    // Construtor para criar uma árvore vazia
	    public ArvoreBinaria() {
	        this.raiz = null;
	    }

	    // Método para inserir um valor na árvore
	    public void inserir(int valor) {
	        this.raiz = inserirRecursivo(this.raiz, valor);
	    }

	    // Método recursivo para inserir um valor na árvore
	    private No inserirRecursivo(No no, int valor) {
	        if (no == null) {
	            return new No(valor);
	        }

	        if (valor < no.valor) {
	            no.esquerda = inserirRecursivo(no.esquerda, valor);
	        } else if (valor > no.valor) {
	            no.direita = inserirRecursivo(no.direita, valor);
	        }

	        return no;
	    }

	    // Método para buscar um valor na árvore
	    public boolean buscar(int valor) {
	        return buscarRecursivo(this.raiz, valor);
	    }

	    // Método recursivo para buscar um valor na árvore
	    private boolean buscarRecursivo(No no, int valor) {
	        if (no == null) {
	            return false;
	        }

	        if (valor == no.valor) {
	            return true;
	        }

	        if (valor < no.valor) {
	            return buscarRecursivo(no.esquerda, valor);
	        } else {
	            return buscarRecursivo(no.direita, valor);
	        }
	    }
	}

	// Exemplo de uso da árvore binária
	public class ArvoreBinariaExemplo {
	    public static void main(String[] args) {
	        ArvoreBinaria arvore = new ArvoreBinaria();

	        // Inserindo elementos na árvore
	        arvore.inserir(10);
	        arvore.inserir(5);
	        arvore.inserir(15);
	        arvore.inserir(3);
	        arvore.inserir(7);

	        // Buscando elementos na árvore
	        System.out.println("Buscando o elemento 7: " + arvore.buscar(7)); // Deve imprimir true
	        System.out.println("Buscando o elemento 12: " + arvore.buscar(12)); // Deve imprimir false
	    }
	}

