
// Classe que herda de Residuo e representa resíduos orgânicos
public class ResiduoOrganico extends Residuo {

    public ResiduoOrganico(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String getTipo() {
        return "Orgânico";
    }
}
