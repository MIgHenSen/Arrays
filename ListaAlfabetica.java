package exer;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaAlfabetica {

	public static void main(String[] args) throws InputMismatchException{
		int tamanho;
		Scanner lerdados = new Scanner(System.in);
		
		try {
			System.out.println("Lista Alfabética de Convidados");
			System.out.println("Quantos convidados: ");
			tamanho = lerdados.nextInt();
			String[] lista=new String[tamanho];
			for(int i=0; i<tamanho; i++) {
				System.out.printf("Informe os nomes[%s]: ",i);
				lista[i]=lerdados.next();
			}
			
			List<String> list = Arrays.asList(lista);
			Collections.sort(list);
			System.out.println(list);
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
		}
	}
}