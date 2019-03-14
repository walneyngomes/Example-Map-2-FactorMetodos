package Metodos;

public class FactoryNames {
	public SobreNome criarSobreNome(String nome) {
		SobreNome nom=null;
		if("gosling".equals(nome)) {
			nom= new SobreNomeGosling();
			nom.sobreNome();
		    
		}
		else if("scott".equals(nome)) {
			nom= new SobreNomeMcNealy();
			nom.sobreNome();
		}
		else if("Naughton".equals(nome)) {
			nom= new SobreNomeNaughton();
			nom.sobreNome();
		}
		return nom;
		
	}
	
	
	public Nome criarNome(String nome){
		Nome nom=null;
		if("james".equals(nome)) {
			nom= new JamesNome();
			nom.nome();
		    
		}
		else if("scoot".equals(nome)) {
			nom= new NomeScoot();
			nom.nome();
		}
		else if("patrick".equals(nome)) {
			nom= new Nomepatrick();
			nom.nome();
		}
		return nom;
		
	}
	
	
	

}
