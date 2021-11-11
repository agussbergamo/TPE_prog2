package main;
import criterios.Criterio;
import criterios.CriterioIdioma;
import requerimientos.Requerimiento;
import requerimientos.RequerimientoAnd;
import requerimientos.RequerimientoGenero;
import requerimientos.RequerimientoIdioma;

import java.util.ArrayList;

public class Tema {

	private String titulo;
	private String idioma;
	private ArrayList<String> generos;	
	private ArrayList<String> instrumentos;
	private Requerimiento requerimiento;
	
	public Tema (String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma; 
		this.generos = new ArrayList<String>();
		this.instrumentos = new ArrayList<String>();
		this.requerimiento = new RequerimientoAnd(new RequerimientoIdioma(), new RequerimientoGenero());
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

	public void setRequerimiento(Requerimiento requerimiento) {
		this.requerimiento = requerimiento;
	}

	public boolean puedeSerInterpretado(Participante p){
		return requerimiento.puedeSerInterpretado(this, p);
	}

	public boolean tieneGenero(Participante p){
		for (String g:generos){
			if(p.cantaGenero(g))
				return true;
		}
		return false;
	}

	public boolean tieneInstrumento(Participante p, int cant){
		for (String i:instrumentos){
			if (p.tocaInstrumento(i) && p.cantTocanInstrumento(i) >= cant)
				return true;
		}
		return false;
	}
}
