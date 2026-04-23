package pctExercicio03;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);

        System.out.print("Digite números: ");
        String texto = receba.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '1') {
                contador++;
            }
        }

        System.out.println("Quantos 1 tem: " + contador);

        receba.close();
    }

}
