package vetores;
import java.util.Scanner;
public class exerc3 {

	public static void main(String[] args) {
		Scanner ler  = new Scanner (System.in);
		
		final int TAM = 10; //constante
		int a[], i, con = 0;
		a = new int [TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "º valor");
			a[i] = ler.nextInt();
		}
		if(i==TAM) {
			i = 0;
			for(i=0;i<TAM;i++) {
				if(a[i]%2==0) { //Se o resto da divisao for = 0 vai fzr
					con++; //contagem dos valores pares
					System.out.print(a[i] + ", "); //apresentando quantos numeros pares tem
				}
			}
			System.out.println(" ");
			System.out.println(con + " sao pares");
		}
		
	}

}
