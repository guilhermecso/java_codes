package HeartRates;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HeartRates {
	public static void main(String[] args) {

		Scanner in1 = new Scanner(System.in);
		System.out.print("Insira seu nome: ");
		String nome = in1.nextLine();
		
		System.out.print("Insira seu sobrenome: ");
		String sobrenome = in1.nextLine();
		System.out.println("Seu nome eh: " + nome + " " + sobrenome);
		Calendar cal = GregorianCalendar.getInstance();
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		int anoAtual = cal.get(Calendar.YEAR);
		
		System.out.print("Insira o dia que voce nasceu: ");
		int diaNasc = in1.nextInt();
		if ((diaNasc <= 0) || (diaNasc > 31)) {
			System.out.println("Dia invalido.");
		} else {
			System.out.print("Insira o mes que voce nasceu: ");
			int mesNasc = in1.nextInt();
			if ((mesNasc <= 0) || (mesNasc > 12)) {
				System.out.println("Mes invalido.");
			} else {
				System.out.print("Insira o ano que voce nasceu: ");
				int anoNasc = in1.nextInt();
				if ((anoNasc <= 0) || (anoNasc > anoAtual)) {
					System.out.println("Ano invalido.");
				} else {
					int Nasc = anoNasc * 365;
					Nasc = Nasc + (mesNasc * 31);
					Nasc = Nasc + diaNasc;
					int Atual = anoAtual * 365;
					Atual = Atual + (mesAtual * 31);
					Atual = Atual + diaAtual;
					System.out.println("Voce nasceu em: " + diaNasc + "/" + mesNasc + "/" + anoNasc);
					System.out.println("Voce tem " + ((Atual - Nasc) / 365) + " anos.");
					int freqMax = 220 - ((Atual - Nasc) / 365);
					System.out.println("Sua frequencia cardiaca maxima eh de: " + freqMax);
					double freqMed1 = freqMax * 0.5;
					double freqMed2 = freqMax * 0.85;
					System.out.println("Sua frequencia cardiaca media deve estar entre " + freqMed1 + " e " + freqMed2);
				}
			}
		}
		in1.close();
	}
	
}
