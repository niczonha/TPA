package classico;
import java.util.Scanner;
public class classicoIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade,i,f1 = 0,f2 = 0,f3 = 0,f4 = 0,f5 = 0, res1,res2,res3,res4,res5;
		
		for(i=1;i<=15;i++) {
			System.out.println("Digite � idade " );
			idade = ler.nextInt();
			if(idade<=15) {
				f1 = f1+1;
			}else if(idade>15&&idade<=30) {
				f2 = f2+1;
			}else if(idade>30 &&  idade <=45) {
				f3 = f3+1;
			}else if(idade>45 && idade <=60) {
				f4 = f4+1;
			}else {
				f5 = f5+1;
			}
		} 
		res1 = f1*100/15;
		System.out.println("Numero de pessoas que est�o na 1� faixa etaria �: " + f1);
		System.out.println("A porcentagem de pessoas que est�o �:" + res1+ "%");
		System.out.println("  ");
		res2 = f2*100/15;
		System.out.println("Numero de pessoas que est�o na 2� faixa etaria �: " + f2);
		System.out.println("A porcentagem de pessoas que est�o �:" + res2+ "%");
		System.out.println("  ");
		res3 = f3*100/15;
		System.out.println("Numero de pessoas que est�o na 3� faixa etaria: " + f3);
		System.out.println("A porcentagem de pessoas que est�o �:" + res3+ "%");
		System.out.println("  ");
		res4 = f4*100/15;
		System.out.println("Numero de pessoas que est�o na 4� faixa etaria: " + f4);
		System.out.println("A porcentagem de pessoas que est�o �:" + res4+ "%");
		System.out.println("  ");
		res5 = f5*100/15;
		System.out.println("Numero de pessoas que est�o na 5� faixetaria: " + f5);
		System.out.println("A porcentagem de pessoas que est�o �:" + res5+ "%");
		
		
}
}
