import java.util.ArrayList;

public class Autor {
	
	private int codAutor;
	private String nomeAutor;
	private String nomeCitacao;
	private String universidade;
	private boolean ehPremiado;
	private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
	
	//Construtores 
	public Autor(){};
	public Autor (int codAut, String nomeAut, String nomeCit, String univer, boolean premio){
		codAutor = codAut;
		nomeAutor = nomeAut;
		nomeCitacao = nomeCit;
		universidade = univer;
		ehPremiado = premio;
	};
	//Método Publicar
	
	public void publicar(int codPubl, String titulo, int ano, String tipo ){
		if(this.publicacoes.size() < 3){
			Publicacao p = new Publicacao();
			p.setCodPublicacao(codPubl);
			p.setTitulo(titulo);
			p.setAno(ano);
			p.setTipo(tipo);
			p.setAutor(this);
			this.publicacoes.add(p);
			System.out.println("Funcionou");
		} else {
			System.out.println("Não funcionou!Limite Atingido");
		}
	}
	//Método de contar publicacoes
	public int contarPublicacoes(){
		return publicacoes.size();
		//this.getPublicacoes().size();
	}
	//Método para listar Publicacoes
	public void listarPublicacoes(){
		System.out.println("- O autor " + this.getNomeAutor() + " tem " + this.contarPublicacoes() 
		+ " publicações:");
		
		for(Publicacao publicacao : publicacoes){
			publicacao.imprimirBibliografia();
		}
		//outro for:
		/*for(int i = 0; i < publicacoes.size(); i++){
			publicacoes.get(i).imprimirBibliografia();
		} */
	}
	
	//Método Premiar Autor 
	public void premiarAutor(){
		if(this.ehPremiado){
			System.out.println("Já é premiado, não pode ser novamente!");
		} else{
			this.setEhPremiado(true);
			System.out.println("Autor premiado!");
			//ou nesse caso pode : this.ehPremiado = true;
		}
	}
	
	//Metodos de Acesso
	public int getCodAutor() {
		return codAutor;
	}
	public void setCodAutor(int codAutor) {
		if (codAutor > 0 ) {
			this.codAutor = codAutor;
			System.out.println("Código Válido!");
		}else {
			System.out.println("Erro!!");
		}
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getNomeCitacao() {
		return nomeCitacao;
	}
	public void setNomeCitacao(String nomeCitacao) {
		this.nomeCitacao = nomeCitacao;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public boolean isEhPremiado() {
		return ehPremiado;
	}
	public void setEhPremiado(boolean ehPremidado) {
		this.ehPremiado = ehPremiado;
	}
	public ArrayList<Publicacao> getPublicacoes() {
		return publicacoes;
	}
	public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}
	
}