package laco;

public class numPar {

	public static void main(String[] args) {
		int i=0,numPar=0;
		
		do {
			numPar = i+numPar;
			System.out.println(i); 
			i = i+2;
		} while(i<=500);
	}

}
