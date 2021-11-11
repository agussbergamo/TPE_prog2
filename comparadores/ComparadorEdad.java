package comparadores;
import main.Participante;
import java.util.Comparator;

public class ComparadorEdad implements Comparator<Participante>{

    public ComparadorEdad() {
    }

    @Override
    public int compare(Participante o1, Participante o2) {
        return o1.getEdad() - o2.getEdad();
    }
}
