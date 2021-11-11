package comparadores;
import main.Participante;
import java.util.Comparator;

public class ComparadorIdiomas implements Comparator<Participante>{
    public ComparadorIdiomas() {
    }

    @Override
    public int compare(Participante o1, Participante o2) {
        return o1.getCantidadIdiomas() - o2.getCantidadIdiomas();
    }
}
