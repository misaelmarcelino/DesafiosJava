package iniciante.cadastroNinjas;

import java.util.Scanner;

public class CadastroDeNinjas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        int qtdCadatro = 0;
        String[] ninjas =  new String[0];
        int[] idades = new int[ninjas.length];

        do {
            System.out.println("\n=============== MENU NINJA ===============");
            System.out.println("1 - Cadastrar Novo Ninja");
            System.out.println("2 - Listar Ninja Cadastrados");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");

            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.println("Quantos ninjas deseja cadastrar? ");
                qtdCadatro = input.nextInt();
                input.nextLine();
                ninjas =  new String[qtdCadatro];
                idades = new int[qtdCadatro];
            }

            switch (option) {
                case 1:

                    for (int i = 0; i < qtdCadatro; i++) {
                        System.out.println("\nIniciando Cadastro de Ninjas: \n");
                        System.out.println("Digite o nome do ninja: ");
                        ninjas[i] = input.nextLine();
                        System.out.println("Digite a idade do ninja: ");
                        idades[i] = input.nextInt();
                        input.nextLine();
                        System.out.println("O ninja " + ninjas[i] + " com a idade " + idades[i] + " cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("\nListando Ninjas Cadastrados: \n");

                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjas[i] != null) {
                            System.out.println("Ninja " + ninjas[i].toUpperCase() + ", " + idades[i] + " anos.");
                        } else {
                            System.out.println("Nenhum ninja cadastrado!");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nObrigado por usar nossa Sistema! Volte Sempre!");
                    break;
                default:
                    System.out.println("\nOpção invalida! Tente novamente.");
                    continue;
            }

        } while (option != 3);

        input.close();

    }
}
