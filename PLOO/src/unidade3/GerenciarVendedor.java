package unidade3;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarVendedor {
	public static void main(String args[]) {
		ArrayList<Vendedor> vendedores = new ArrayList<>();
		Scanner scr = new Scanner(System.in);
		
		
		vendedores.add(new Vendedor("Pedro", 25, 8000));
		vendedores.add(new Vendedor("João", 65, 25000));
		vendedores.add(new Vendedor("Maria", 45, 15000));
		vendedores.add(new Vendedor("Ana", 75, 30000));
		vendedores.add(new Vendedor("Carlos", 20, 5000));
	
		Vendedor vendedorMaisExperiente = vendedores.get(0);
		for(Vendedor vendedor : vendedores) {
			if(vendedor.getTempoServico() > vendedorMaisExperiente.getTempoServico()) {
				vendedorMaisExperiente = vendedor;
			}
		}
		System.out.println("Vendedor com maior tempo de serviço: ");
		System.out.println(vendedorMaisExperiente + "\n");
		
		System.out.println("Nome e categoria de todos os vendedores: ");
		for(Vendedor vendedor : vendedores) {
			System.out.println("Nome: " +vendedor.getNome()+ ", Categoria: " +vendedor.getCategoria());
		}
		System.out.println();
		
		double totalVendas = 0;
		for(Vendedor vendedor : vendedores) {
			totalVendas += vendedor.getTotalVendas();
		}
		System.out.println("Total de todas as vendas: R$" +totalVendas);
		
		
		System.out.println("Digite o nome do vendedor a ser removido: ");
		String nomeRemover = scr.nextLine();
		Vendedor vendedorRemover = null;
		
		for(Vendedor vendedor : vendedores) {
			if(vendedor.getNome().equalsIgnoreCase(nomeRemover)) {
				vendedorRemover = vendedor;
				break;
			}
		}
		if(vendedorRemover != null) {
			vendedores.remove(vendedorRemover);
			System.out.println("Vendedor " +nomeRemover+ " removido da lista.");
		}else {
			System.out.println("Vendedor " +nomeRemover+ " não encontrado");
		}
		System.out.println("\nLista atualizada de vendedores: ");
		for(Vendedor vendedor : vendedores) {
			System.out.println(vendedor);
		}
		scr.close();
	}

}
