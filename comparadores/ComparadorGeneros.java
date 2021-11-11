package comparadores;
import main.Participante;
import java.util.Comparator;

public class ComparadorGeneros implements Comparator<Participante> {

    public ComparadorGeneros() {
    }

    @Override
    public int compare(Participante o1, Participante o2) {
        return o1.getCantGeneros() - o2.getCantGeneros();
    }
}
