package br.com.jhonatansouza.jug2;

public class Noticia {

	private String titulo;
	private String enlace;
	
	public Noticia(String titulo, String enlace) {
		this.titulo = titulo;
		this.enlace = enlace;
	}


	public String getTitulo() {
		return titulo;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", enlace=" + enlace + "]";
	}
		
	
}
