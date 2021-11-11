package criterios;

import main.Participante;
import main.Tema;

public class CriterioTema extends Criterio{
    private Tema t;

    public CriterioTema(Tema t) {
        this.t = t;
    }

    @Override
    public boolean cumple(Participante p) {
        return t.puedeSerInterpretado(p);
    }
}
