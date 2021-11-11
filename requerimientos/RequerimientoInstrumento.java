package requerimientos;

import main.Participante;
import main.Tema;

public class RequerimientoInstrumento extends Requerimiento{
    private int cantMiembros;

    public RequerimientoInstrumento(int cantMiembros) {
        this.cantMiembros = cantMiembros;
    }
    public RequerimientoInstrumento(){
        this.cantMiembros = 1;
    }


    @Override
    public boolean puedeSerInterpretado(Tema t, Participante p) {
        return t.tieneInstrumento(p, cantMiembros);
    }
}
