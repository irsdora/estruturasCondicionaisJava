import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) {
		
	// Number valor = Double.valueOf("a1.63"); *//
		
	Number valor;
	try {
		valor = NumberFormat.getInstance().parse("a1.63");
		System.out.println(valor);
	} catch (ParseException e) {
		e.printStackTrace();
	}
		
	}

}
