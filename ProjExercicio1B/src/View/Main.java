package View;

import Model.Nadador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User Input
        Scanner entrada = new Scanner(System.in);

        // Cria nadador
        Nadador cielo = new Nadador();

        // Entrada usuário
        System.out.print("Digite o nome do atleta: ");
        cielo.setNome(entrada.nextLine());

        System.out.print("Digite a idade do atleta: ");
        cielo.setIdade(entrada.nextInt());

        // Processamento e saída
        System.out.println(cielo);
        System.out.println(cielo.classificar());
    }
}
