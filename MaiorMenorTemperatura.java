package exer;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMenorTemperatura {
	public static void main(String[] args){
		// Declaracao de variaveis do tipo inteiro
		int tamanho, maior, menor;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			// Pequeno texto sobre a funcao do software
			System.out.println("Para saber a maior e a menor temperatura...");
			System.out.println("Quantas temperaturas foram registradas: ");
			
			// //Variavel auxiliar para o tamanho da lista
			tamanho = lerdados.nextInt();
			// Criacao da lista
			float[] temp=new float[tamanho];
			for(int i=0; i<tamanho; i++) {
				// Pedido para informar os valores da lista, digitados pelo usuario
				System.out.printf("Informe as temperaturas[%d]: ",i);
				// Le os valores e os coloca em suas respectivas posicoes na lista
				temp[i]=lerdados.nextInt();
			}
			
			// Metodo para definir a maior temperatura
			maior=(int) temp[0];
			for(int i=0; i<tamanho; i++) {
				if (temp[i]>maior) {
					maior = (int) temp[i];
				}
			}
			
			// Metodo para definir a menor temperatura
			menor=(int) temp[0];
			for(int i=0; i<tamanho; i++) {
				if (temp[i]<menor) {
					menor = (int) temp[i];
				}
			}
			
			// Exibe as temperaturas
			System.out.printf("A temperatura mais alta do dia foi: %d\n",maior);
			System.out.printf("A temperatura mais baixa do dia foi: %d\n",menor);
			
		// Tratamento de excecoes
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores vÃ¡lidos, por favor!");
		}
	}
}