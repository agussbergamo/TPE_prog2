package criterios;

import main.Participante;

public class CriterioGenero extends Criterio {

	private String genero;
	
	public CriterioGenero (String genero) {
		this.genero = genero;
	}
	
	@Override
	public boolean cumple(Participante p) {
		return p.getGeneros().contains(genero);
	}
}
