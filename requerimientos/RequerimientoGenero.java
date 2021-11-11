package requerimientos;

import main.Participante;
import main.Tema;

public class RequerimientoGenero extends Requerimiento{

    @Override
    public boolean puedeSerInterpretado(Tema t, Participante p) {
        return t.tieneGenero(p);
    }
}
