package recurcao;

import javax.swing.*;

public class RecurcaoUm {

   public static int Soma1 (int nro, int soma) // soma1: método recursivo que soma números de um a 10 

    {

        int s;

      

        if (nro == 10){

          s = nro + soma;

        }

        else{

          s = Soma1(nro+1, nro+soma); // faz o incremento dos números 

        }

        return s;

    }

   public static void main (String arg []) // ponto de entrada do programa 

    {

      int soma;

      soma = Soma1(1, 0);

      JOptionPane.showMessageDialog(null,"A soma dos 10 primeiros números é: "+soma);

   

      System.exit(0);

    }

 }

