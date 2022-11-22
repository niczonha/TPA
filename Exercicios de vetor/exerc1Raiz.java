package vetores;
import java.util.Scanner;
public class exerc1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int t = 10;
		int i;
		double  b[];
		int a[];
		
		a = new int [t];
		b = new double [t];
		
		for(i=0; i<t; i++) {
			System.out.println("Entre com o " +(i+1)+ "º valor");
			a[i] = ler.nextInt();
			b[i]= Math.sqrt(a[i]);
			System.out.println(b[i]);
			
			
		}
		
	

	}

}
