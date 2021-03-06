package main;
import java.util.ArrayList;
import java.util.Collections;
import criterios.Criterio;

public class Jurado {

	private String nombre;
	private String apellido;
	private ArrayList<Participante> equipo;
	private Criterio criterioDeAceptacion;
	
	public Jurado (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipo = new ArrayList<Participante>();
		this.criterioDeAceptacion = null;
	}

	public void setCriterioDeAceptacion(Criterio criterioDeAceptacion) {
		this.criterioDeAceptacion = criterioDeAceptacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void addParticipante(Participante p) {
		if(!equipo.contains(p)){
			if (criterioDeAceptacion == null)
				equipo.add(p);
			else
				if (criterioDeAceptacion.cumple(p))
					equipo.add(p);
		}
	}
	
	public ArrayList<String> getInstrumentosEquipo() {
		ArrayList<String> instrumentosEquipo = new ArrayList<>();
		for (int i=0; i<equipo.size(); i++) {
			ArrayList<String> instrumentosParticipantei = equipo.get(i).getInstrumentos();
			for (int j=0; j<instrumentosParticipantei.size(); j++) {
				if (!instrumentosEquipo.contains(instrumentosParticipantei.get(j)))
						instrumentosEquipo.add(instrumentosParticipantei.get(j));
			} 
		}
		return instrumentosEquipo;
	}

	public ArrayList<String> getIdiomasEquipo() {
		ArrayList<String> idiomasEquipo = new ArrayList<>();
		for (int i=0; i<equipo.size(); i++) {
			ArrayList<String> idiomasParticipantei = equipo.get(i).getIdiomas();
			for (int j=0; j<idiomasParticipantei.size(); j++) {
				if (!idiomasEquipo.contains(idiomasParticipantei.get(j)))
						idiomasEquipo.add(idiomasParticipantei.get(j));
			} 
		}
		return idiomasEquipo;
	}

	public ArrayList<String> getGenerosEquipo() {
		ArrayList<String> generosEquipo = new ArrayList<>();
		for (int i=0; i<equipo.size(); i++) {
			ArrayList<String> generosParticipantei = equipo.get(i).getGeneros();
			for (int j=0; j<generosParticipantei.size(); j++) {
				if (!generosEquipo.contains(generosParticipantei.get(j)))
						generosEquipo.add(generosParticipantei.get(j));
			} 
		}
		Collections.sort(generosEquipo);
		return generosEquipo;
	}
	
	public double getPromedioEdad () {
		int totalEdad = 0;
		for (int i=0; i<equipo.size(); i++) {
			totalEdad += equipo.get(i).getEdad();
		}
		return totalEdad/equipo.size();	
	}
	
	public ArrayList<Participante> getParticipantesAptos(Criterio c) {
		ArrayList<Participante> aptos = new ArrayList<>();
		for(int i=0; i<equipo.size(); i++) {
			aptos.addAll(equipo.get(i).getParticipantesAptos(c));
		}
		return aptos;
	}
}
