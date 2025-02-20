package pesquisa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    //Objetos vetor e vetorHash acessíveis globalmente pelos métodos
    public static int[] vetor = new int[0];
    public static int[] vetorOrdenado = new int[0];
    public static int[] vetorHash = new int[0];

    //Valores de comparacoes e tempo levado por cada tipo de pesquisa acessíveis globalmente
    //e atualizados a cada ultima execucao dos algoritmos
    public static int comparacoesSequencial, comparacoesBinaria;
    public static double tempoSequencial, tempoBinaria;

    public static void main(String[] args) {

        //Loop do menu principal
       int opcaoPrincipal;
       do {
           opcaoPrincipal = Interface.menuPrincipal();

           int desejado;

           switch (opcaoPrincipal) {
               case 0:
                   System.out.println("Encerrando programa.");
                   break;
               case 1:
                   criarVetor();
                   break;
               case 2:
                   lerArquivo();
                   break;
               case 3:
                   System.out.println("Numero a ser buscado: ");
                   desejado = Interface.lerInteiro();
                    pesquisaSequencial(desejado);
                    break;
               case 4:
                   System.out.println("Numero a ser buscado: ");
                   desejado = Interface.lerInteiro();
                   pesquisaBinaria(desejado);
                   break;
               case 5:
                   compararAlgoritmos();
                   break;
               case 6:
                   System.out.println("Numero a ser buscado: ");
                   desejado = Interface.lerInteiro();
                   pesquisaHashing(desejado);
                   break;
               case 7:
                   limparVetor();
                   break;
               default:
                   System.out.println("Opcao invalida. Tente novamente.");
                   break;
           }
       } while(opcaoPrincipal != 0);

    }


    //Cria um vetor com numeros aleatorios ou preenchidos manualmente
    public static void criarVetor() {
        if(vetor.length != 0) {
            System.out.println("Ja existe um vetor. Use a opcao limpar vetor primeiro.");
            return;
        }

        System.out.println("Escolha o tamanho do vetor:");
        int tamanho = Interface.lerInteiro();

        vetor = new int[tamanho];

        //Loop da opçao do vetor (aleatorio ou manual)
        int opcaoVetor;
        do {
            opcaoVetor = Interface.menuVetor();

            switch (opcaoVetor) {
                case 0:
                    System.out.println("Voltando ao menu principal.");
                    vetor = null;
                    return;
                case 1:
                    preencherAleatorio();
                    break;
                case 2:
                    preencherManual();
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;

            }
        } while(opcaoVetor != 1 && opcaoVetor != 2);


        System.out.println("Vetor criado:");
        imprimirVetor();
        ordenarVetor();
        criarVetorHash();
    }

    //Preenche o vetor com numeros aleatorios
    public static void preencherAleatorio() {
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10000);
        }
    }

    //Preenche o vetor com numeros informados manualmente
    public static void preencherManual() {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Numero " + (i+1));
            vetor[i] = Interface.lerInteiro();
        }
    }

    //Imprime o vetor
    public static void imprimirVetor() {
        for (int j : vetor) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void imprimirVetorOrdenado() {
        for (int j : vetorOrdenado) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //Le um arquivo com o nome informado e cria um vetor com os numeros dele
    public static void lerArquivo() {
        if(vetor.length != 0) {
            System.out.println("Ja existe um vetor. Use a opcao limpar vetor primeiro.");
            return;
        }

        System.out.print("Informe o nome do arquivo (ex: numeros.txt): ");
        String nomeArquivo = scanner.nextLine();

        try {

            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            int linhas = 0;
            while (leitor.readLine() != null) {
                linhas++;
            }
            leitor.close();

            vetor = new int[linhas];

            leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            int i = 0;
            while ((linha = leitor.readLine()) != null) {
                vetor[i] = Integer.parseInt(linha.trim());
                i++;
            }
            leitor.close();

            System.out.println("Vetor criado a partir do arquivo:");
            imprimirVetor();
            ordenarVetor();
            criarVetorHash();


        } catch (IOException e) {
            System.out.println("Arquivo nao encontrado");
        } catch (NumberFormatException e) {
            System.out.println("Arquivo invalido");
        }
    }

    //Realiza a pesquisa sequencial, se o vetor ja tiver sido criado
    public static void pesquisaSequencial(int desejado) {

        if(vetor.length == 0) {
            System.out.println("Vetor inexistente. Use as opcoes de criar vetor ou ler um arquivo.");
            return;
        }

        //Tempo e comparacoes iniciais
        tempoSequencial = System.nanoTime();
        comparacoesSequencial = 0;

        int i;
        for(i = 0; i < vetor.length; i++) {
            comparacoesSequencial++;
            if(vetor[i] == desejado) {
                System.out.println("Numero " + desejado + " encontrado na posicao " + i);
                tempoSequencial = System.nanoTime() - tempoSequencial;
                return;
            }
        }

        tempoSequencial = System.nanoTime() - tempoSequencial;
        System.out.println("Numero desejado " + desejado + " nao foi encontrado.");
    }

    //Realiza a pesquisa binaria do numero desejado, se o vetor ja tiver sido criado
    public static void pesquisaBinaria(int desejado) {

        if(vetorOrdenado.length == 0) {
            System.out.println("Vetor inexistente. Use as opcoes de criar vetor ou ler um arquivo.");
            return;
        }

        tempoBinaria = System.nanoTime();
        comparacoesBinaria = 0;

        int inicio = 0;
        int fim = vetorOrdenado.length - 1;

        int resultado = -1;

        while (inicio <= fim) {

            comparacoesBinaria++;

            int meio = (inicio + fim) / 2;

            if (vetorOrdenado[meio] == desejado) {
                resultado = meio;
                break;
            } else {
                comparacoesBinaria++;

                if (vetorOrdenado[meio] < desejado) {

                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }


        tempoBinaria = System.nanoTime() - tempoBinaria;

        if(resultado == -1) {
            System.out.println("Numero " + desejado + " nao foi encontrado.");
        } else {
            System.out.println("Numero desejado " + desejado + " encontrado na posicao " + resultado);
        }

    }

    //Compara os algoritmos executando ambos para o mesmo numero desejado
    //e imprimindo o tempo levado e a quantidade de comparacoes para cada
    public static void compararAlgoritmos() {
        System.out.println("Numero a ser buscado: ");
        int desejado = Interface.lerInteiro();

        pesquisaSequencial(desejado);
        pesquisaBinaria(desejado);

        System.out.println("Pesquisa sequencial: " + tempoSequencial + " ns e " + comparacoesSequencial + " comparacoes");
        System.out.println("Pesquisa binaria: " + tempoBinaria + " ns e " + comparacoesBinaria + " comparacoes");

    }

    //Realiza uma pesquisa hashing calculando o resto da divisao do valor desejado pelo tamanho do vetor hash
    //procura sequencialmente ate encontrar o valor, devido ao tratamento de colisoes
    public static void pesquisaHashing(int desejado) {
        int pos = desejado % vetorHash.length;

        for(int i = pos; i < vetorHash.length; i++) {
            if(vetorHash[i] == desejado) {
                System.out.println("Numero " + desejado + " encontrado na posicao " + i);
                return;
            }
        }

        System.out.println("Numero " + desejado + " nao encontrado.");

    }

    //Apaga o vetor criado
    public static void limparVetor() {
        vetor = new int[0];
    }

    //Ordena o vetor utilizando o algoritmo BubbleSort
    public static void ordenarVetor() {

        vetorOrdenado = new int[vetor.length];
        for(int i = 0; i < vetor.length; i++) {
            vetorOrdenado[i] = i;
        }

        boolean trocou;
        int n = vetorOrdenado.length;

        do {
            trocou = false;

            for (int i = 0; i < n - 1; i++) {
                if (vetorOrdenado[i] > vetorOrdenado[i + 1]) {

                    int temp = vetorOrdenado[i];
                    vetorOrdenado[i] = vetorOrdenado[i + 1];
                    vetorOrdenado[i + 1] = temp;
                    trocou = true;
                }
            }

            n--;
        } while (trocou);

        System.out.println("Vetor ordenado:");
        imprimirVetorOrdenado();

    }

    //Cria um vetor hash a partir do vetor principal utilizando o resto da divisao
    public static void criarVetorHash() {
        vetorHash = new int[vetor.length];

        for (int i = 0; i < vetorHash.length; i++) {
            vetorHash[i] = Integer.MIN_VALUE;
        }
        int pos;
        for (int i = 0; i < vetor.length; i++) {
            pos = vetor[i] % vetorHash.length;

            while (vetorHash[pos] != Integer.MIN_VALUE) {
                pos = (pos + 1) % vetorHash.length;
            }

            vetorHash[pos] = vetor[i];
        }

    }

}