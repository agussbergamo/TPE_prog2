package criterios;

import main.Participante;

public class CriterioIntegrantes extends Criterio{
    private int cantIntegrantes;

    public CriterioIntegrantes(int cantIntegrantes) {
        this.cantIntegrantes = cantIntegrantes;
    }

    @Override
    public boolean cumple(Participante p) {
        return false;
    }
}
