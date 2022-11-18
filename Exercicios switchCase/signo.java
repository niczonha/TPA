package escola;

import java.util.Scanner;

public class signo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes,dia;
		
		System.out.println("Digite o numero do mes que voce nasceu");
		mes = ler.nextInt();
		System.out.println("Digite o dia que voce nasceu");
		dia = ler.nextInt();
		
		switch(mes){
			case 3:
				if(dia>=1 && dia<=20) {
					System.out.println("Peixes");
				}
				if (dia>=21 && dia <=31) {
					System.out.println("Aries");
				}
				break;
			case 4:
				if (dia>=1 && dia<=20) {
					System.out.println("Aries");
				}
				if (dia>=21 && dia <=30) {
					System.out.println("Touro");
				}
				break;
			case 5:
				if (dia >=1 && dia<=21) {
					System.out.println("Touro");
				}
				if (dia >=20 && dia<=31) {
					System.out.println("Gemeos");
				}
				break;
			case 6:
				if (dia>=1 && dia<=20) {
					System.out.println("Gemeos");
				}
				if (dia >=21 && dia<30) {
					System.out.println("Cancer");
				}
				break;
			case 7:
				if (dia>=1 && dia<=21) {
					System.out.println("Cancer");
				}
				if (dia>=22 && dia<=31) {
					System.out.println("leao");
				}
				break;
			case 8:
				if(dia>=1 && dia<=22) {
					System.out.println("leao");
				}
				if(dia>=23 && dia<=31) {
					System.out.println("Virgem");
				}
				break;
			case 9:
				if(dia>=1 && dia<=22) {
					System.out.println("Virgem");
				}
				if (dia>=23 && dia<30) {
					System.out.println("Libra");
				}
				break;
			case 10:
				if(dia >=1 && dia<=21) {
					System.out.println("Libra");
				}
				if(dia>=21 && dia<=31) {
					System.out.println("Escorpiao");
				}
				break;
			case 11:
				if(dia>=1 && dia<=21) {
					System.out.println("Escorpiao");
				}
				if(dia>=22 && dia<30) {
					System.out.println("Sagitario");
				}
				break;
			case 12:
				if(dia>=1 && dia<=21) {
					System.out.println("Sagitario");
				}
				if (dia >=22 && dia<=31) {
					System.out.println("Capricornio");
				}
				break;
			case 1:
				if (dia>=1 && dia<=20) {
					System.out.println("Capricornio");
				}
				if (dia>=21 && dia<31) {
					System.out.println("Aquario");
				}
				break;
			case 2:
				if (dia>=1 && dia<=28) {
					System.out.println("Peixes");
				}
			default:
				System.out.println("Mes invalido");
		}
	}

}
