package main;

import criterios.Criterio;

import java.util.ArrayList;

public abstract class Participante {

    public abstract int getEdad();
    public abstract ArrayList<String> getGeneros();
    public abstract ArrayList<String> getIdiomas();
    public abstract ArrayList<String> getInstrumentos();

    public abstract ArrayList<Participante> getParticipantesAptos(Criterio c);

    public boolean cantaIdioma(String idioma) {
        return this.getIdiomas().contains(idioma);
    }
    public boolean cantaGenero(String genero){
        return this.getGeneros().contains(genero);
    }

    public boolean tocaInstrumento(String instrumento){ return this.getInstrumentos().contains(instrumento);}

    public abstract int cantTocanInstrumento(String instrumento);

}
