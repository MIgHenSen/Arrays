package exer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMenorTemperatura {

	public static void main(String[] args) throws InputMismatchException{
		int tamanho, maior, menor;
		Scanner lerdados = new Scanner(System.in);
		
		try {
			System.out.println("Quantas temperaturas foram registradas: ");
			tamanho = lerdados.nextInt();
			float[] temp=new float[tamanho];
			for(int i=0; i<tamanho; i++) {
				System.out.printf("Informe as temperaturas[%d]: ",i);
				temp[i]=lerdados.nextInt();
			}
			
			maior=(int) temp[0];
			for(int i=0; i<tamanho; i++) {
				if (temp[i]>maior) {
					maior = (int) temp[i];
				}
			}
			
			menor=(int) temp[0];
			for(int i=0; i<tamanho; i++) {
				if (temp[i]<menor) {
					menor = (int) temp[i];
				}
			}
			
			System.out.printf("A temperatura mais alta do dia foi: %d\n",maior);
			System.out.printf("A temperatura mais baixa do dia foi: %d\n",menor);
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
		}
	}
}