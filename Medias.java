package exer;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Medias {
	public static void main(String[] args){
		// Declaracao de variaveis do tipo inteiro
		int alunos, atividades;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			// Pequeno texto sobre a funcao do software
			System.out.println("Para saber a media dos alunos...");
			System.out.println("Quantos alunos realizaram as atividades: ");
			
			// Variaveis auxiliares para a criacao da lista
			alunos = lerdados.nextInt();
			System.out.println("Quantas atividades foram passadas: ");
			atividades = lerdados.nextInt();
			// Criacao de lista baseada em 2 valores
			float[][] medias=new float[alunos][atividades];
			for(int i=0; i<medias.length; i++) {
				for(int j=0; j<medias[0].length; j++) {
					// Pede as notas de cada aluno
					System.out.printf("Digite as notas[%d]: ",j);
					// Cria uma lista de notas para cada aluno
					medias[i][j]=lerdados.nextFloat();
				}
			}
			
			// Calcula as medias
			float total=0;
			for(int a=0; a<alunos; a++) {
				for(int m=0; m<atividades; m++) {
					total = (medias[a][m]+medias[a][m])/2;
				}
				// Exibe as medias
				System.out.println("Media: " + total);
			}
			
		// Tratamento de excecoes
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores validos, por favor!");
		}
	}
}