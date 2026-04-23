package pctExercicio02;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
  	  System.out.print("Digite uma string: ");
        String texto = receba.nextLine();

        boolean ehPalindromo = true;

        int tamanho = texto.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (texto.charAt(i) != texto.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }

        receba.close();
    }
}
