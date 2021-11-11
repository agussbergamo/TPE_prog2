package comparadores;
import main.Participante;
import java.util.Comparator;

public class ComparadorAnd implements Comparator<Participante>{
    private Comparator<Participante> c1, c2;

    public ComparadorAnd(Comparator<Participante> c1, Comparator<Participante> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Participante o1, Participante o2) {
        int res = c1.compare(o1, o2);
        if (res == 0)
            res = c2.compare(o1, o2);
        return res;
    }
}
