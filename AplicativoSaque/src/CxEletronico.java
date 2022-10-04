
public class CxEletronico {

	public static void main(String[] args) {
		
		double saldo = 22.0;
		double saqueSolicitado = 12.0;
		
		if(saqueSolicitado < saldo)
			saldo = saldo - saqueSolicitado;
	   
		System.out.println(saldo);
	}

}
