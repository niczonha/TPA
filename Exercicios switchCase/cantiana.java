package escola;

import java.util.Scanner;

public class cantiana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c;
		
		System.out.println("Digite o código do produto");
		c = ler.nextInt();
		switch (c) {
		case 1:
			System.out.println( "Cachorro quente" );
			System.out.println("R$ 8,00");
			break;
		case 2:
			System.out.println( "Cheeseburguer" );
			System.out.println( "R$ 12,00" );
			break;
		case 3:
			System.out.println( "X-salada" );
			System.out.println( "R$ 15,00" );
			break;
		case 4:
			System.out.println( "Misto quente" );
			System.out.println( "R$ 11,00" );
			break;
		case 5:
			System.out.println( "Pão na chapa" );
			System.out.println( "R$ 6,00" );
			break;
			default:
				System.out.println("Não há essa opção no sistema");
		}
				
	}

}
