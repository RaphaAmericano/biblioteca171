public class Teste {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		Autor a1 = new Autor();
		a1.setCodAutor(1);
		a1.setNomeAutor("Raphael Americano");
		a1.setNomeCitacao("AMERICANO, R.");
		a1.setUniversidade("PUC-Rio");
		
		Autor a2 = new Autor();
		a2.setCodAutor(2);
		a2.setNomeAutor("Rubens Melo");
		a2.setNomeCitacao("MELO, R.");
		a2.setUniversidade("PUC-Rio");
		
		
		a1.publicar(1, "Java Use a Cabeça 1", 2005, "Livro");
		a1.publicar(2, "Java Use a Cabeça 2", 2005, "Livro");
		a1.publicar(3, "Java Use a Cabeça 3", 2005, "Livro");
		a1.publicar(4, "Java Use a Cabeça 4", 2005, "Livro");
		
		a1.premiarAutor();
		a1.premiarAutor();
		
		a1.getPublicacoes().get(0).imprimirBibliografia();
		a1.getPublicacoes().get(1).imprimirBibliografia();
		a1.getPublicacoes().get(2).imprimirBibliografia();
		
		a1.listarPublicacoes();
	}//Fim main

}//Fim Teste
//Ctrl + i = indenta tudo 