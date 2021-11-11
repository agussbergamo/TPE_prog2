package comparadores;
import main.Participante;
import java.util.Comparator;

public class ComparadorInstrumentos implements Comparator<Participante> {

    public ComparadorInstrumentos() {
    }

    @Override
    public int compare(Participante o1, Participante o2) {
        return o1.getCantidadInstrumentos() - o2.getCantidadInstrumentos();
    }
}
