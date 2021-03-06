package main;

import comparadores.ComparadorEdad;
import comparadores.ComparadorIdiomas;
import criterios.*;

public class MainReality {

	public static void main(String[] args) {

		Sistema s = new Sistema();
		Tema t1 = new Tema("La pollera amarilla", "Aleman");
		Tema t2 = new Tema("El Juanca de la Gente", "Portugues");
		Jurado j1 = new Jurado ("Matias", "Falcon");
		Jurado j2 = new Jurado ("Exequiel", "Hernando");
		Solista p1 = new Solista ("Agustina", "Sbergamo", 24);
		Solista p2 = new Solista ("Gladys", "LaBomba", 56);
		Solista p3 = new Solista ("Marta", "S?nchez", 32);
		Solista p4 = new Solista ("Ricky", "Martin", 40);
		Banda b1 = new Banda("Los Pehua");
	
		s.addJurado(j1);
		s.addJurado(j2);
		
		s.addParticipante(p1);
		s.addParticipante(p2);
		
		b1.addParticipante(p3);
		b1.addParticipante(p4);
		s.addParticipante(b1);
		
		s.addTema(t1);
		s.addTema(t2);
		
		j1.addParticipante(p1);
		j1.addParticipante(p2);
		j1.addParticipante(b1);
		j2.addParticipante(p3);
		j2.addParticipante(p4);
		
		p1.addGenero("pop");
		p1.addGenero("rock");
		p2.addGenero("folclore");
		p2.addGenero("reggaeton");
		p2.addGenero("pop");
		p3.addGenero("pop");
		p3.addGenero("rock");
		p3.addGenero("folclore");
		p4.addGenero("reggaeton");
		p4.addGenero("pop");
		
		p1.addIdioma("Ingles");
		p1.addIdioma("Castellano");
		p1.addIdioma("Aleman");
		p2.addIdioma("Ingles");
		p2.addIdioma("Portugues");
		p3.addIdioma("Aleman");
		p4.addIdioma("Aleman");

		p1.addInstrumento("bombo");
		p1.addInstrumento("Ukelele");
		p2.addInstrumento("Triangulo");
		p2.addInstrumento("Arpa");
		p2.addInstrumento("Ukelele");
		p3.addInstrumento("Bombo");
		p3.addInstrumento("Ukelele");
		p4.addInstrumento("Triangulo");
		p4.addInstrumento("Arpa");
		p4.addInstrumento("Bombo");
				
		t1.addInstrumento("Bombo");
		t1.addInstrumento("Ukelele");
		t2.addInstrumento("Triangulo");
		t2.addInstrumento("Arpa");
		
		t1.addGenero("pop");
		t1.addGenero("rock");
		t2.addGenero("folclore");
		t2.addGenero("reggaeton");

		CriterioInstrumento ci = new CriterioInstrumento("Ukelele");
		CriterioGenero cg = new CriterioGenero("pop");
		CriterioIdioma cid = new CriterioIdioma ("Aleman");
		CriterioAnd ca1 = new CriterioAnd (ci, cg);
		CriterioAnd ca2 = new CriterioAnd (ca1, cid);

		System.out.println(s.getParticipantesBatalla(ca2));
		System.out.println(s.ganadorBatalla(new ComparadorEdad(), p1, p2));
		System.out.println(s.rankingBatalla(new ComparadorIdiomas()));
		System.out.println(j1.getParticipantesAptos(new CriterioTema(t1)));

	}

}
