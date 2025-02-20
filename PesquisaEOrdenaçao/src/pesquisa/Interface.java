package pesquisa;

import java.util.Scanner;

public class Interface {

    public static Scanner scanner = new Scanner(System.in);

    public static int menuPrincipal() {

        System.out.println("---[Menu principal]---");
        System.out.println("Escolha uma opcao:");
        System.out.println("1. Criar vetor");
        System.out.println("2. Ler arquivo");
        System.out.println("3. Realizar pesquisa sequencial");
        System.out.println("4. Realizar pesquisa binária");
        System.out.println("5. Comparar algoritmos");
        System.out.println("6. Realizar pesquisa com hashing");
        System.out.println("7. Limpar vetor");
        System.out.println("0. Sair");
        System.out.print("Sua opcao: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    public static int menuVetor() {
        System.out.println("---[Menu vetor]---");
        System.out.println("Escolha uma opcao:");
        System.out.println("1. Gerar valores aleatórios");
        System.out.println("2. Preencher valores manualmente");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Sua opcao: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    public static int lerInteiro() {
        System.out.print("Digite um valor: ");
        Integer valor = null;
        while (valor == null) {
            try {
                valor = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Entrada invalida. Tente novamente.");
            }
        }
        return valor;
    }
}
