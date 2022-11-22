package classico;

public class tabuada {

	public static void main(String[] args) {
		int i=1, res, n=1;
		
		while(n<=10){
			i=1;
			System.out.println(" ");
			do {
				res = n*i;
				System.out.println(n + "x" + i + "=" + res);
				i++;
			}while(i<10);
			n=n+1;
			}
		}
			
	}

	



