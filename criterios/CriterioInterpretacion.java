package criterios;

import main.Participante;
import main.Tema;

public class CriterioInterpretacion extends Criterio{
    private Tema tema;

    public CriterioInterpretacion(Tema tema) {
        this.tema = tema;
    }

    @Override
    public boolean cumple(Participante p) {
        if (p.cantaIdioma(tema.getIdioma())){
            if (p.)
        }

    }
}
