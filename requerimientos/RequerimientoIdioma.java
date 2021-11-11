package requerimientos;

import main.Participante;
import main.Tema;

public class RequerimientoIdioma extends Requerimiento{

    @Override
    public boolean puedeSerInterpretado(Tema t, Participante p) {

        return p.cantaIdioma(t.getIdioma());

    }
}
