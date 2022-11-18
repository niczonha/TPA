package escola;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int aluno, mb, b, r, i, media, escolha;
		
		System.out.println("Digite o numero de alunos que tem na sua sala");
		aluno = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram MB");
		mb = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram B");
		b = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram R");
		r = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram I");
		i = ler.nextInt();
		System.out.println("1 - Estatistica dos MB 2 - Estatistica dos B");
		System.out.println("3 - Estatistica dos R  4 - Estatistica dos I");
		System.out.println("Escolha um numero");
		escolha = ler.nextInt();
		switch (escolha) {
			case 1:
				media = (mb*100)/aluno;
				System.out.println(media+"% dos seus alunos tiram MB");
				break;
			case 2:
				media = (b*100)/aluno;
				System.out.println(media+"% dos seus alunos tiram B");
				break;
			case 3:
				media = (r*100)/aluno;
				System.out.println(media+"% dos seus alunos tiram R");
				break;
			case 4:
				media = (i*100)/aluno;
				System.out.println(media+"% dos seus alunos tiram I");
				break;
			default:
				System.out.println("Nota Invalida");
			}
		ler.close();
	

	}

}
