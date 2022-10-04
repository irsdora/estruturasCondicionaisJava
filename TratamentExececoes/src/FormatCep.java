
public class FormatCep {

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("22763064");
			System.out.println("cepFormatado");
		} catch(CepInvalidoException e) {
			System.out.println("O cep não corresponde com as regras de negócio");
			
			e.printStackTrace();
		}
		String cepFormatado = formatarCep("22.763.064");
		static String formatarCep(String cep)throws CepInvalidoException{
			if(cep.length() !=8)
				throw new CepInvalidoException();
		
			return "22.763.064";
		}

	}

}
