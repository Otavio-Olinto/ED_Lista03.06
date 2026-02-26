/*
 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número 
inteiro (N), apresente a saída da somatória :

			S = 1 + 1/2! + 1/3! + 1/4! + ... + 1/N!
 */

package view;

import java.util.Scanner;
import controller.SequenciaFracao;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe SequenciaFracao
		SequenciaFracao metodo = new SequenciaFracao();
		
		// Criando o método de leitura com Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite até qual número deseja da sequência: ");
		int num = Integer.parseInt(ler.nextLine());
		
		System.out.println("O valor da somátoria desta sequência até o número "+
							num+" é: "+metodo.sequencia(num));
		
		ler.close();

	}

}
