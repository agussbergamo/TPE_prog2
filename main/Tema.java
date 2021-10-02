package main;
import java.util.ArrayList;

public class Tema {

	private String titulo;
	private String idioma;
	private ArrayList<String> generos;	
	private ArrayList<String> instrumentos;
	
	public Tema (String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma; 
		this.generos = new ArrayList<String>();
		this.instrumentos = new ArrayList<String>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public ArrayList<String> getGeneros() {
		return new ArrayList<String>(generos);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	
	public void addGenero(String g) {
		if (!generos.contains(g))
			generos.add(g);
	}
	
	public void addInstrumento(String i) {
		if (!instrumentos.contains(i))
			instrumentos.add(i);
	}
	
	
	
	
}
