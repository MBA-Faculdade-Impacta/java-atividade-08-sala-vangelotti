package br.com.impacta.lab;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Crie duas classes diferentes no mesmo pacote:
		 * 
		 * 1-
		 * PessoaFisica
		 * Atributo			tipo do atributo
		 * documento		String
		 * tipo				String
		 * 
		 * 2-
		 * PessoaJuridica
		 * Atributo			tipo do atributo
		 * documento		String
		 * tipo				String
		 * 
		 * Faça as duas classes implementarem a interface Pessoa
		 * para poder implementarem os metodos:
		 * 
		 	public String falarDocumento();
			public String getTipo();
		 * 
		 * 
		 * 
		 * 
		 */
		
		Pessoa pf = new PessoaFisica();
		pf.setDocumento("45875412575");
		pf.setTipo("PF");
		
		
		System.out.println(pf.falarDocumento());
		System.out.println(pf.getTipo());
	}

}
