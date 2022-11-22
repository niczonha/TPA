package vetores;
import java.util.Scanner;
public class exerc2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 5;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o " +(i+1)+ "º valor");
			a [i] = ler.nextInt();
		}
		for(i=(TAM-1);i>=0;i--) {
			b[i] = a[i];
			System.out.print(b[i] + ", ");
		}
		
	}

}
