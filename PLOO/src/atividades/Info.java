package atividades;
import java.util.ArrayList;
public class Info {
	
	public static void fillIn(ArrayList<Integer> aList) {
		for(int i = 0; i < 10; i++) {
			int num = (int) ((Math.random() * 50) + 1);
			aList.add(num);
		}
	}
}
