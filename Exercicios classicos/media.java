
package classico;
import java.util.Scanner;
public class media {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int maior = -100, menor = 200, idade, i ;
		double alt, somaAlt = 0, altMedia;
		
		for(i=1;i<=5;i++) {
			System.out.println("Digite a idade");
			idade = ler.nextInt();
			System.out.println("Digite a altura");
			alt = ler.nextDouble();
			if(idade<=menor) {
				menor = idade;
			} if (idade>=maior ){
				maior = idade;
			}
			somaAlt = alt+somaAlt;
		}
		
		altMedia = somaAlt/10;
		
		System.out.println("A pessoa mais nova t�m: " + menor);
		System.out.println("A pessoa mais velha t�m: " + maior);
		System.out.printf("A m�dia das alturas � de:%.2f%n " ,altMedia);
	}

}
