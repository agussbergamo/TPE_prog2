package main;

import criterio.Criterio;

import java.util.ArrayList;

public abstract class Participante {

    public abstract int getEdad();
    public abstract ArrayList<String> getGeneros();
    public abstract ArrayList<String> getIdiomas();
    public abstract ArrayList<String> getInstrumentos();

    public abstract ArrayList<Participante> getParticipantesAptos(Criterio c);

}
