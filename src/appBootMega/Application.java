package appBootMega;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Random randomizacao = new Random();
		
		int tentativa = 1;
		boolean acerto = false;
		
		int apostaRandomica [] = new int[6];
		int acertoRandomico [] = new int [6];
		
		while(acerto == false) {
			for(int i = 0; i < apostaRandomica.length; i++) {
				apostaRandomica [i] = randomizacao.nextInt((60 - 1) + 1) +1;
				acertoRandomico [i] = randomizacao.nextInt((60 - 1) + 1) +1;
			}
			if(Arrays.equals(apostaRandomica, acertoRandomico)) {
				System.out.println("Tentativa: " + tentativa);
				System.out.println("Números sorteados: " + Arrays.toString(apostaRandomica));
				acerto = true;
			}
			else {
				System.out.println("Tentativa: " + tentativa + " - falha!");
				tentativa++;
			}
		}		

	}

}
