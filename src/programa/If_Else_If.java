package programa;

import java.util.Scanner;

public class If_Else_If {
    /*Normalmente utilizado quando há uma regra de negócio ou funcionalidade
    com alto número de condicionantes (3 ou mais) dentro de uma mesma regra ou funcionalidade*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0){
            System.out.println("Nota Inválida!");
        }
        else if (nota > 8.1){
            System.out.println("Conceito A");
        }
        else if (nota >= 6.1){
            System.out.println("Conceito B");
        }
        else if (nota >= 4.1){
            System.out.println("Conceito C");
        }
        else if (nota >= 2.1){
            System.out.println("Conceito D");
        }
        else  {
            System.out.println("Conceito E");
        }







        entrada.close();
    }

}
