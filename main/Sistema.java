package main;
import java.util.ArrayList;
import criterio.Criterio;


public class Sistema {

	private ArrayList<Participante> participantes;
	private ArrayList<Jurado> jurados;
	private ArrayList<Tema> temas;
	
	public Sistema () {
		this.participantes = new ArrayList<Participante>();
		this.jurados = new ArrayList<Jurado>();
		this.temas = new ArrayList<Tema>();
	}
	
	public void addParticipante (Participante p) {
		if(!participantes.contains(p))
			participantes.add(p);
	}
	
	public void addJurado (Jurado j) {
		if(!jurados.contains(j))
			jurados.add(j);
	}
	
	public void addTema (Tema t) {
		if(!temas.contains(t))
			temas.add(t);
	}
	
	public ArrayList<Participante> getParticipantesBatalla(Criterio c) {
		ArrayList<Participante> aptosBatalla = new ArrayList<Participante>();
		for (int i=0; i<jurados.size(); i++) {
			ArrayList<Participante> aptosJuradoi = jurados.get(i).getParticipantesAptos(c);
			for (int j=0; j<aptosJuradoi.size(); j++) {
				if (!aptosBatalla.contains(aptosJuradoi.get(j)))
						aptosBatalla.add(aptosJuradoi.get(j));
			} 
		}
		return aptosBatalla;
	}
	
	
}


