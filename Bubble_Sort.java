package exers;
/* O metodo BubbleSort se baseia na ideia de comparar repetidamente pares 
 * de elementos adjacentes e, em seguida, trocar suas posicoes se estiverem na
 * ordem errada */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		int tamanho, total=0, aux=0;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Organizando numeros em ordem crescente ");
			System.out.println("Quantos nÃºmeros deseja organizar: ");
			
			tamanho = scanner.nextInt();
			int[] soma=new int[tamanho];
			for(int i=0; i<tamanho; i++) {
				System.out.printf("Informe os numeros[%d]: ",i);
				soma[i]=scanner.nextInt();
			}
			
			for(int i=0; i<tamanho; i++) {
				for(int j=0; j<tamanho-1; j++) {
					if(soma[j]>soma[j+1]) {
						aux=soma[j];
						soma[j]=soma[j+1];
						soma[j+1]=aux;
					}
				}
			}
			
			System.out.println("Agora organizado: ");
			for(int i=0; i<tamanho; i++) {
				System.out.println(""+soma[i]);
			}
			
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		 * ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores vÃ¡lidos, por favor!");
		}
}
}
