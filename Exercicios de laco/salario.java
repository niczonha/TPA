import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i;
	    double salario,desconto = 0;
	    
	    for(i=1;i<=1;i++) {
	    	System.out.println("Digite o seu salario");
	    	salario = ler.nextDouble();
	    	if(salario<=2000) {
	    		desconto = salario*8.5/100;
	    	}else {
	    		desconto = salario*11/100;
	    	}
	  
	    	i++;
	    }
	    System.out.println(desconto);
	}

}
