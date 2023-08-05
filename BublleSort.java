package exer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BublleSort {

	public static void main(String[] args) throws InputMismatchException{
		int tamanho, total=0, aux=0;
		Scanner lerdados = new Scanner(System.in);
		
		try {
			System.out.println("Organizando números em ordem crescente ");
			System.out.println("Quantos números: ");
			tamanho = lerdados.nextInt();
			int[] soma=new int[tamanho];
			for(int i=0; i<tamanho; i++) {
				System.out.printf("Informe os numeros[%d]: ",i);
				soma[i]=lerdados.nextInt();
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
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
		}
	}
}