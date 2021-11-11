package criterios;

import main.Participante;

public class CriterioInstrumento extends Criterio {

	private String instrumento;
	
	public CriterioInstrumento (String instrumento) {
		this.instrumento = instrumento;
	}
	
	@Override
	public boolean cumple(Participante p) {
		return p.getInstrumentos().contains(instrumento);
	}

}
