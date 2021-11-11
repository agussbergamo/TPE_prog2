package requerimientos;

import main.Participante;
import main.Tema;

public abstract class Requerimiento {

    public abstract boolean puedeSerInterpretado(Tema t, Participante p);
}
