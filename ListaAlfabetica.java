package exer;
/* A biblioteca Collections traz dados e metodos para armazenar e manipular
 * varios elementos. O metodo sort recebe uma lista e a ordena em ordem crescente
 * (alfabetica) */

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaAlfabetica {
	public static void main(String[] args){
		// Declaracao de variavel do tipo inteiro
		int tamanho;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			// Pequeno texto sobre a funcao do software
			System.out.println("Para organizar em ordem alfabetica: ");
			System.out.println("Quantas palavras/nomes: ");
			
			// //Variavel auxiliar para o tamanho da lista
			tamanho = lerdados.nextInt();
			// Criacao da lista
			String[] lista=new String[tamanho];
			for(int i=0; i<tamanho; i++) {
				// Pedido para informar os valores da lista, digitados pelo usuario
				System.out.printf("Informe os nomes[%s]: ",i);
				// Le os valores e os coloca em suas respectivas posicoes na lista
				lista[i]=lerdados.next();
			}
			
			List<String> list = Arrays.asList(lista);
			// Ordena a lista
			Collections.sort(list);
			// Exibe a lista organizada
			System.out.println(list);
			
		// Tratamento de excecoes
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores vÃ¡lidos, por favor!");
		}
	}
}