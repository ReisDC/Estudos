package Carioca;

/*public class num4{
	public static void main(String[] args){
			int a = 1;

			do{
					a *= 3;
			}while(a < 200);
			System.out.println(a);
	}
}
*/

public class num4{
	/*public static void main(String[] args) {
		
		int a = 1;
		
		a *= 3;
		while(a < 200) {
			a *= 3;
		}
		System.out.println(a);
	}
	 */
	public static void main(String[] args) {
		
		int n = 3;
		
		int [][] mat = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		boolean achouNegativo = false;
		for(int lin = 0; lin < n && !achouNegativo; lin++) {
			for(int col = 0; col < n && !achouNegativo; col++) {
				if(mat[lin] [col] <= 0) {
					achouNegativo = true;
				}
			}
		}
		if(achouNegativo) {
			System.out.println("Tem elemento negativo");
		}else {
			System.out.println("Tem elemento positivo");
		}
	}
}
	
