package classico;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, anterior=0, exibir=1, atual=1, i=1;
		System.out.println("Digite a quantidade de numeros de Fibonacci que deseja ver");
		n = ler.nextInt();
		do {
			System.out.print(exibir+"  ");
			exibir = atual+anterior;
			anterior = atual;
			atual= exibir;
			i++;
			
		}while(i<=n);

	}

}
