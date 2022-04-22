package programa;

import java.util.Locale;
import java.util.Scanner;

public class If_Else_If_DiaDaSemana {
    //A funcionalidade é: O usuario vai digitar o dia da semana e retornaremos o numero do dia da semana correspondente
    // Ex: O usuario digita Domingo = 1
    // O usuario digita Segunda = 2 ... e assim sucessivamente.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diaSemana = entrada.next();

        if ("domingo".equalsIgnoreCase(diaSemana)) {
            System.out.println(1);
        }
        else if ("segunda".equalsIgnoreCase(diaSemana)){
            System.out.println(2);
        }
        else if ("terça".equalsIgnoreCase(diaSemana) || "terca".equalsIgnoreCase(diaSemana)) {
            System.out.println(3);
        }
        else if ("quarta".equalsIgnoreCase(diaSemana)){
            System.out.println(4);
        }
        else if ("quinta".equalsIgnoreCase(diaSemana)){
            System.out.println(5);
        }
        else if ("sexta".equalsIgnoreCase(diaSemana)){
            System.out.println(6);
        }
        else if ("sábado".equalsIgnoreCase(diaSemana) || "sabado".equalsIgnoreCase(diaSemana)){
            System.out.println(7);
        }
        else {
            System.out.println("Dia inválido");
        }

       boolean fimDeSemana =
                "sabado".equalsIgnoreCase(diaSemana) || "sábado".equalsIgnoreCase(diaSemana) ||
                "domingo".equalsIgnoreCase(diaSemana);

        boolean diasDaSemana =
                "segunda".equalsIgnoreCase(diaSemana) ||
                "terça".equalsIgnoreCase(diaSemana) || "terca".equalsIgnoreCase(diaSemana) ||
                "quarta".equalsIgnoreCase(diaSemana) ||
                "quinta".equalsIgnoreCase(diaSemana) ||
                "sexta".equalsIgnoreCase(diaSemana);

        if (diasDaSemana) {
            System.out.println("É dia da semana!!!");
        } else if (fimDeSemana){
            System.out.println("É final de semana!!!");
        }else {
            System.out.println("Ops!!! Digite o dia novamente...");
        }
        entrada.close();
    }


}
