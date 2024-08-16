
import java.util.ArrayList;
import java.util.List;

// Classe Lixeira que contém uma coleção de resíduos
public class Lixeira {
    private List<Residuo> residuos;

    public Lixeira() {
        residuos = new ArrayList<>();
    }

    public void adicionarResiduo(Residuo residuo) {
        residuos.add(residuo);
    }

    public List<Residuo> getResiduos() {
        return residuos;
    }

    public void mostrarResiduos() {
        for (Residuo residuo : residuos) {
            System.out.println(residuo.getNome() + " - " + residuo.getTipo() + " - " + residuo.getPeso() + "kg");
        }
    }
}

