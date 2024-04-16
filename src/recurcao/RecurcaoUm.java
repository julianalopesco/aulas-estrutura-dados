package recurcao;

import javax.swing.*;

class Somar100

 {

   public static int Soma1 (int nro, int soma)

    {

        int s;

      

        if (nro == 100){

          s = nro + soma;

        }

        else{

          s = Soma1(nro+1, nro+soma);

        }

        return s;

    }

   public static void main (String arg [])

    {

      int soma;

      soma = Soma1(1, 0);

      JOptionPane.showMessageDialog(null,"A soma dos cem primeiros números é: "+soma);

   

      System.exit(0);

    }

 }

