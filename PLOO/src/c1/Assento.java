package c1;

public class Assento {
	private boolean[][] disponivel;
	
	public Assento() {
		disponivel = new boolean [5][4];
		for(int i = 0; i < disponivel.length; i++) {
			for(int j = 0; j < disponivel[i].length; j++) {
				disponivel[i][j] = true;
			}
		}
	}
	
	public String mostrarLugares() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < disponivel.length; i++) {
			sb.append("|");
			for(int j = 0; j < disponivel[i].length; j++) {
				if(disponivel[i][j]) {
					sb.append("   |");
				}else {
					sb.append(" X |");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public boolean venderAssento(int fila, int assento) {
		if(disponivel[fila][assento]) {
		   disponivel[fila][assento] = false;
		   return true;
		}else {
			return false;
		}
	}
}
