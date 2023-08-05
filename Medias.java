package exer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medias {

	public static void main(String[] args) throws InputMismatchException{
		int alunos, atividades;
		Scanner lerdados = new Scanner(System.in);
		
		try {
			System.out.println("Quantos alunos realizaram as atividades: ");
			alunos = lerdados.nextInt();
			System.out.println("Quantas atividades foram passadas: ");
			atividades = lerdados.nextInt();
			float[][] medias=new float[alunos][atividades];
			for(int i=0; i<medias.length; i++) {
				for(int j=0; j<medias[0].length; j++) {
					System.out.printf("Digite as notas[%d]: ",j);
					medias[i][j]=lerdados.nextFloat();
				}
			}
			
			float total=0;
			for(int a=0; a<alunos; a++) {
				for(int m=0; m<atividades; m++) {
					total = (medias[a][m]+medias[a][m])/2;
				}
				System.out.println("Media: " + total);
			}
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
		}
	}
}