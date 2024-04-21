package estruturasDados;

//Fila vazia, método função sem parâmetros que retorona true se a fila está vazia
public boolean FilaVazia ()
{
	if (total == 0)
	{
		return true;
	}
	else 
	{
		return false; 
	}
}

//Fila cheia, método função sem parâmetros que retorona true se a fila está cheia
public boolean FilaCheia ()
{
	if (total >= tamanho)
	{
		return true;
	}
	else 
	{
		return false; 
	}
}


//Método enfileirar. Recebe um elemento como parâmetro para ser enfileirado
public void Enfileirar (int elemento)
{
	if (!FilaCheia()) //verifica se a fila não está cheia antes
	{
		vetor[fim] = elemento;
		fim = fim + 1; 
		toal = total + 1;
		if (fim>= tamanho)
		{
			fim = 0; 
		}
	}
	else 
	{
		System.out,println ("Fila Cheia");
	}
}

//Método Desenfileirar, função sem parâmetros se a fila não está vazia antes de desenfileirar 

public int Desenfileirar ()
{
	int desenfileirado = 0; 
	if (FilaVazia())
	{
		System.out.println("Fila Vazia");
	}
	else 
	{
		desenfileirado = vetor[inicio];
		inicio = inicio  + 1;
		total = total -1;
		if (inicio >= tamanho)
		{
			inicio = 0;
		}
	}
	return desenfileirado;
}

//operação elemento início, mostra o elemento do início da fila

public void ElementoInicio()
{
	if (!FilaVazia()) //!: negação lógica, inverte o valor da expressão 
	{
		System.out.println("O primeiro elemento é "+vetor[inicio]);
	}
	else
	{
		System.out.println("Fila Vazia");
	}
}

//método de manipulação que é um procedimento que mostra os elementos para o usuário 
public void MostrarFila ()
{
	int i, aux;
	
	aux = inicio;
	for (i = 1; i <= total; i++)
	{
		JOptionPane.showMessageDialog(null, "Elemento " + vetor [aux] +
				                            " posição " + i);
		aux = aux +1;
		if (aux >= tamanho)
		{
			aux = 0; 
		}
	}
}