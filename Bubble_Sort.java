package exers;
/* O metodo BubbleSort se baseia na ideia de comparar repetidamente pares 
 * de elementos adjacentes e, em seguida, trocar suas posicoes se estiverem na
 * ordem errada */

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		// Declaracao de variaveis inteiras
		int tamanho, total=0, aux=0;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner scanner = new Scanner(System.in);
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			// Pequeno texto sobre a funcao do software
			System.out.println("Organizando numeros em ordem crescente ");
			System.out.println("Quantos nÃºmeros deseja organizar: ");
			
			//Variavel auxiliar para o tamanho da lista
			tamanho = scanner.nextInt();
			// Criacao da lista
			int[] soma=new int[tamanho];
			for(int i=0; i<tamanho; i++) {
				// Pedido para informar os valores da lista, digitados pelo usuario
				System.out.printf("Informe os numeros[%d]: ",i);
				// Le os valores e os coloca em suas respectivas posicoes na lista
				soma[i]=scanner.nextInt();
			}
			
			// Metodo que oraganiza a lista
			for(int i=0; i<tamanho; i++) {
				for(int j=0; j<tamanho-1; j++) {
					if(soma[j]>soma[j+1]) {
						aux=soma[j];
						soma[j]=soma[j+1];
						soma[j+1]=aux;
					}
				}
			}
			
			// Agora, sao exibidos os valores da lista de forma organizada
			System.out.println("Agora organizado: ");
			for(int i=0; i<tamanho; i++) {
				System.out.println(""+soma[i]);
			}
			
		// Tratamento de excecoes
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		 * ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores vÃ¡lidos, por favor!");
		}
}
}