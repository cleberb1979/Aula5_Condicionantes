package programa;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        // if - Dentro do construtor do IF sempre vai receber uma condição sendo verdadeira ou falso
        if (media >= 7.0) {
            System.out.println("Aprovado");
        }
        if (media <= 10.0 && media >= 7.0) {
            System.out.println("Aprovado1");
        }
        if (media < 7.0 && media >= 4.5){
            System.out.println("Recuperação");
        }
        if (media < 4.5 && media >= 0){
            System.out.println("Reprovado");
        }

        boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
        if (criterioReprovacaoAtingido) {
            System.out.println("Reprovado2");
        }
    }
}
