package pctExercicio04;

import java.util.Scanner;

public class exercício04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = receba.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }

       receba.close();
    }


	}


