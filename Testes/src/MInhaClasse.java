
public class MInhaClasse {

	public static void main(String[] args) {
		String primeiroNome = "Filipe";
		String sobreNome = "Coelho";

		String nomeCompleto = nomeCompleto(primeiroNome, sobreNome);
		System.out.println(nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String sobreNome) {

		return primeiroNome.concat(" ").concat(sobreNome);
	}
} 