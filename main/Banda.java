package main;

import criterios.Criterio;

import java.util.ArrayList;
import java.util.Collections;

public class Banda extends Participante{
    private ArrayList<Participante> participantes;
    private String nombreBanda;


    public Banda(String nombre){
        this.nombreBanda = nombre;
        this.participantes = new ArrayList<>();
    }

    @Override
    public int getEdad() {
        int aux = 0;
        for (int i = 0; i < participantes.size(); i++){
            aux += participantes.get(i).getEdad();
        }
        return aux / participantes.size();
    }

    @Override
    public ArrayList<String> getGeneros() {
        ArrayList<String> generosEnComun = participantes.get(0).getGeneros();

        for (int i = 1; i < participantes.size(); i++){
            generosEnComun.retainAll(participantes.get(i).getGeneros());
        }
        Collections.sort(generosEnComun);
        return generosEnComun;
    }

    @Override
    public ArrayList<String> getIdiomas() {
        ArrayList<String> idiomas = new ArrayList<>();

        for (Participante p: participantes){
            ArrayList<String> idiomasParticipante = p.getIdiomas();
            for (String i:idiomasParticipante){
                if (!idiomas.contains(i)){
                    idiomas.add(i);
                }
            }
        }
        return idiomas;
    }

    @Override
    public ArrayList<String> getInstrumentos() {
        ArrayList<String> instrumentos = new ArrayList<>();

        for (Participante p: participantes){
            ArrayList<String> instrumentosParticipante = p.getInstrumentos();
            for (String i:instrumentosParticipante){
                if (!instrumentos.contains(i)){
                    instrumentos.add(i);
                }
            }
        }
        return instrumentos;
    }

    @Override
    public ArrayList<Participante> getParticipantesAptos(Criterio c) {
        ArrayList<Participante> aptos = new ArrayList<>();
        if (c.cumple(this)) {
            aptos.add(this);
        }
        else {
            for(int i=0; i<participantes.size(); i++) {
                if(c.cumple(participantes.get(i)))
                    aptos.add(participantes.get(i));
            }
        }
        return aptos;
    }

    @Override
    public int cantTocanInstrumento(String instrumento) {
        int contador = 0;
        for (Participante p:participantes){
            contador+= p.cantTocanInstrumento(instrumento);
        }
        return contador;
    }
/*
    @Override
    public ElementoComposite copia(Filtro f) {
        Seccion copia = new Seccion(this.getDescripcion(), this.getNombreImagen());
        for(ElementoComposite e: elementos) {
            ElementoComposite copiaHijo = e.copia(f);
            if(copiaHijo != null)
                copia.agregarElemento(e.copia(f));
        }
        if(copia.tieneElementos())
            return copia;
        else
            return null;
    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }*/
}
