package media;

import java.util.Scanner;

public class SomaMediaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota0, nota1, nota2, nota3;
		double media;
		double faltou = 7;

		System.out.println("Nota do Primeiro Bimestre");
		nota0 = sc.nextDouble();
		System.out.println("Nota do Segundo Bimestre");
		nota1 = sc.nextDouble();
		System.out.println("Nota do Terceiro Bimestre");
		nota2 = sc.nextDouble();
		System.out.println("Nota do Quarto Bimestre");
		nota3 = sc.nextDouble();
		media = (nota0 + nota1 + nota2 + nota3) / 4;
		System.out.println("media do aluno = " + media);
		sc.close();
		faltou = (faltou - media);
		if (media < 7) {
			System.out.println("Aluno reprovado, por apenas " + faltou);
		} else {
			System.out.println("Aprovado com sucesso");
		}

	}
}
