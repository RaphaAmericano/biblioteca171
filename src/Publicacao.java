public class Publicacao {
	private int codPublicacao;
	private String titulo;
	private int ano;
	private String tipo;
	private Autor autor;
	
	//Metodo de Imprimir
	public void imprimirBibliografia(){
	
		System.out.println(this.getAutor().getNomeCitacao() + ". " 
				//outras maneiras seriam this.autor ou autor.getNomeCitacao() ou autor apenas
				+ this.getTitulo() + ". " //this.titulo
				+ this.tipo + ". " // this.getTipo()
				+ this.getAno() + ". " // this.ano
				);
	}
	
	//Métodos de Acesso
	public int getCodPublicacao() {
		return codPublicacao;
	}
	public void setCodPublicacao(int codPublicacao) {
		this.codPublicacao = codPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}