package main;

import criterios.CriterioGenero;
import criterios.CriterioInstrumento;

import java.util.ArrayList;

public class JuradoExigente extends Jurado{
    private String instrumento, genero;
    private ArrayList<String> idiomas;
    private CriterioGenero criterioGenero;
    private CriterioInstrumento criterioInstrumento;

    public JuradoExigente(String nombre, String apellido, String inst, String gen) {
        super(nombre, apellido);
        this.instrumento = inst;
        this.genero = gen;
        this.idiomas = new ArrayList<>();
    }

    public String getInstrumento() {
        return instrumento;
    }

    public String getGenero() {
        return genero;
    }


    @Override
    public void addParticipante(Participante p){
        if (p.tocaInstrumento(this.getInstrumento()) && p.cantaGenero(this.getGenero())){

        }
    }
}
