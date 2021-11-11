package comparadores;

import java.util.Comparator;

import main.Participante;

public class ComparadorNot implements Comparator<Participante> {

	private Comparator<Participante> c;
	
	public ComparadorNot(Comparator<Participante> c) {
		this.c = c;
	}

	@Override
	public int compare(Participante o1, Participante o2) {
		return -c.compare(o1, o2);
	}

}
