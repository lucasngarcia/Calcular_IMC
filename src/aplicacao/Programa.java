package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import calculadora.IMC;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		IMC[] vetor = new IMC[2];
		
		for (int i = 0; i  != vetor.length; i++) {
			System.out.printf("Digite o nome da %d pessoa: ", i+1);
			String nome = sc.nextLine();
			System.out.printf("Digite a altura da %d pessoa: ", i+1);
			double altura = sc.nextDouble(); 
			System.out.printf("Digite o peso da %d pessoa: ", i+1);
			double peso = sc.nextDouble();
			sc.nextLine();
			vetor[i] = new IMC(nome, altura, peso);
			vetor[i].calcularIMC();
		}
		
		for (int i = 0; i != vetor.length; i++) {
			System.out.println(vetor[i].toString());
		}
		
		if (vetor[0].getImc() > vetor[1].getImc()) {
			System.out.println(vetor[0].getNome() + " tem imc maior que " + vetor[1].getNome());
		}else {
			System.out.println(vetor[1].getNome() + " tem imc maior que " + vetor[0].getNome());
		}
		
	}

}
