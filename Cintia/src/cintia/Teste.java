package cintia;
import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String args[]) {
		List<Pastel> arrayList = new ArrayList<>();
		arrayList.add(new Pastel("carne"));
		arrayList.add(new Pastel("presunto"));
		arrayList.add(new Pastel("calabresa"));
		System.out.println(arrayList);
	}
}
