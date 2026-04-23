package pctExercicio01;

import java.util.Scanner;

public class exercício01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner receba = new Scanner(System.in);

    System.out.print("Digite uma string: ");
    
    String texto = receba.nextLine();


    System.out.println("Número de caracteres: " + texto.length());

    System.out.println("String em maiúsculo: " + texto.toUpperCase());

    
    int contador = 0;
    String vogais = "aeiouAEIOU";

    for (int i = 0; i < texto.length(); i++) {
        if (vogais.indexOf(texto.charAt(i)) != -1) {
            contador++;
        }
    }

    System.out.println("Número de vogais: " + contador);

    receba.close();
}
}
