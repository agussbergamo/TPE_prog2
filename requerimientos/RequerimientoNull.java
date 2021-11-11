package requerimientos;

import main.Participante;
import main.Tema;

public class RequerimientoNull extends Requerimiento{
    @Override
    public boolean puedeSerInterpretado(Tema t, Participante p) {
        return true;
    }
}
