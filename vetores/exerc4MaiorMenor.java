package vetores;
import java.util.Scanner;
public class exerc4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int t=10;
		int maior = -100, menor = 200, i, a[];
		
		a = new int [t];
		for(i=0;i<t;i++) {
			System.out.println("Entre com o " +(i+1)+ "º valor");
			a[i] = ler.nextInt();
			if (a[i]<=menor) {
				menor = a[i];
			}if (a[i]>=maior){
				maior = a[i];
			}
		}
		System.out.println("O menor valor é " +menor);
		System.out.println("O maior valor é "+maior);
	}

}
