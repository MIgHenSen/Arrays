package exer;
/* A biblioteca Collections traz dados e metodos para armazenar e manipular
 * varios elementos. O metodo sort recebe uma lista e a ordena em ordem crescente
 * (alfabetica) */

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaAlfabetica {
	public static void main(String[] args){
		int tamanho;
		Scanner lerdados = new Scanner(System.in);
		
		try {
			System.out.println("Para organizar em ordem alfabetica: ");
			System.out.println("Quantas palavras/nomes: ");
			
			tamanho = lerdados.nextInt();
			String[] lista=new String[tamanho];
			for(int i=0; i<tamanho; i++) {
				System.out.printf("Informe os nomes[%s]: ",i);
				lista[i]=lerdados.next();
			}
			
			List<String> list = Arrays.asList(lista);
			Collections.sort(list);
			System.out.println(list);
			
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores vÃ¡lidos, por favor!");
		}
	}
}
