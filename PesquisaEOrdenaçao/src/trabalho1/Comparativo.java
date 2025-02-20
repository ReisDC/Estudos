package trabalho1;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Comparativo {
	public static int[] lerArquivo(String filePath) throws IOException{
		File file = new File(filePath);
		if(!file.exists()) {
			System.out.println("Arquivo não encontrado. Gerando arquivos teste!");
			gerarArquivosTeste();
			throw new FileNotFoundException("Arquivo não encontrado. Novos arquivos foram gerados");
		}
		List<Integer> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String linha;
			while((linha = br.readLine()) != null) {
				list.add(Integer.parseInt(linha.trim()));
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
	
	// Gerar arquivos teste
	public static void gerarArquivosTeste() throws IOException{
		String diretorioAtual = Paths.get("").toAbsolutePath().toString();
		gerarArquivo(diretorioAtual + "/aleatorio_100.txt", gerarArrayAleatorio(100));
        gerarArquivo(diretorioAtual + "/crescente_100.txt", gerarArrayCrescente(100));
        gerarArquivo(diretorioAtual + "/decrescente_100.txt", gerarArrayDecrescente(100));
        gerarArquivo(diretorioAtual + "/aleatorio_10000.txt", gerarArrayAleatorio(10000));
        gerarArquivo(diretorioAtual + "/crescente_10000.txt", gerarArrayCrescente(10000));
        gerarArquivo(diretorioAtual + "/decrescente_10000.txt", gerarArrayDecrescente(10000));

        System.out.println("Arquivos gerados no diretório: " + diretorioAtual);
    }
	public static void gerarArquivo(String nomeArquivo, int[] array)throws IOException{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (int num : array) {
                writer.write(num + "\n");
          }
	}
		System.out.println("Arquivo gerado" +nomeArquivo);
	}
	// Cria um vetor de inteiros aleatórios
    public static int[] gerarArrayAleatorio(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size * 10); // Gera números aleatórios
        }
        return array;
    }

    // Cria um vetor de inteiros ordenados crescentemente
    public static int[] gerarArrayCrescente(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Cria um vetor de inteiros ordenados decrescentemente
    public static int[] gerarArrayDecrescente(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }
    public static void main(String[] args) {
        try {
            String filePath = "aleatorio_100.txt"; // Altere conforme necessário :)

            // Leitura do arquivo e execução dos algoritmos de ordenação
            int[] array = lerArquivo(filePath);

            // Inserção Direta
            Info insercaoStats = Ordenacao.insercaoDireta(array.clone());
            System.out.println("Inserção Direta - Comparações: " + insercaoStats.comparacoes + ", Movimentações: " + insercaoStats.movimentos);

            // Seleção Direta
            Info selecaoStats = Ordenacao.selecaoDireta(array.clone());
            System.out.println("Seleção Direta - Comparações: " + selecaoStats.comparacoes + ", Movimentações: " + selecaoStats.movimentos);

            // Bubble Sort
            Info bubbleStats = Ordenacao.bubbleSort(array.clone());
            System.out.println("Bubble Sort - Comparações: " + bubbleStats.comparacoes + ", Movimentações: " + bubbleStats.movimentos);

            // Shaker Sort
            Info shakerStats = Ordenacao.shakerSort(array.clone());
            System.out.println("Shaker Sort - Comparações: " + shakerStats.comparacoes + ", Movimentações: " + shakerStats.movimentos);

            // Shell Sort
            Info shellStats = Ordenacao.shellSort(array.clone());
            System.out.println("Shell Sort - Comparações: " + shellStats.comparacoes + ", Movimentações: " + shellStats.movimentos);

            // Heap Sort
            Info heapStats = Ordenacao.heapSort(array.clone());
            System.out.println("Heap Sort - Comparações: " + heapStats.comparacoes + ", Movimentações: " + heapStats.movimentos);

            // Quick Sort
            Info quickStats = Ordenacao.quickSort(array.clone());
            System.out.println("Quick Sort - Comparações: " + quickStats.comparacoes + ", Movimentações: " + quickStats.movimentos);

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
