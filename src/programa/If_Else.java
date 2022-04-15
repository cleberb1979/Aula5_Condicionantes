package programa;

import javax.swing.*;

public class If_Else {

    public static void main(String[] args) {

        //JOptionPane - pop-up
        String valor = JOptionPane.showInputDialog("Informe o número:");
        int numero = Integer.parseInt(valor);

        //% Operador módulo - para identificar o tipo de um valor "Impar" ou "Par"
        /*if (numero % 2 == 0){
            System.out.println("Número par");
        }
        if (numero % 2 == 1){
            System.out.println("Número ímpar");
        }*/

        if (numero % 2 == 0){
            System.out.println("Número par");
        }else {
            System.out.println("Número ímpar");
        }
    }
}
