package main;
import java.util.ArrayList;

public class Participante {

	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> generos;
	private ArrayList<String> idiomas; 
	private ArrayList<String> instrumentos;
	
	public Participante (String nombre, String apellido, int edad) {	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generos = new ArrayList<String>();
		this.idiomas = new ArrayList<String>();
		this.instrumentos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<String> getGeneros() {
		return new ArrayList<String>(generos);
	}

	public ArrayList<String> getIdiomas() {
		return new ArrayList<String>(idiomas);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	
	public boolean equals(Object o) {
		Participante aux = (Participante)o;
		return (aux.getNombre().equals(this.getNombre())&&(aux.getApellido().equals(this.getApellido())));
	}
	
	public void addGenero (String g) {
		if(!generos.contains(g))
			generos.add(g);		
	}
	
	public void addInstrumento (String i) {
		if(!instrumentos.contains(i))
			instrumentos.add(i);		
	}
	
	public void addIdioma (String i) {
		if(!idiomas.contains(i))
			idiomas.add(i);		
	}
	
	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
}
