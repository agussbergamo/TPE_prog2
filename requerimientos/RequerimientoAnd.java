package requerimientos;

import main.Participante;
import main.Tema;

public class RequerimientoAnd extends Requerimiento{
    private Requerimiento r1, r2;

    public RequerimientoAnd(Requerimiento r1, Requerimiento r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public boolean puedeSerInterpretado(Tema t, Participante p) {
        return r1.puedeSerInterpretado(t, p) && r2.puedeSerInterpretado(t, p);
    }
}
