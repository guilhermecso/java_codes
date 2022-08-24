package CebolinhaIdioma;

import java.util.Scanner;

public class CebolinhaIdioma {
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		System.out.print("Insira uma frase: ");
		String frase = in1.nextLine();
		String traducao = frase.replace("r","l");
		String traducao2 = traducao.replace("ll","l");
		String traducao3 = traducao2.replace("l ","r ");
		System.out.println("Frase traduzida: "+traducao3);
			
		
		in1.close();
	}
}
