
// Classe que herda de Residuo e implementa a interface Reciclavel
public class ResiduoReciclavel extends Residuo implements Reciclavel {
    private String material;

    public ResiduoReciclavel(String nome, double peso, String material) {
        super(nome, peso);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String getTipo() {
        return "Reciclável";
    }

    @Override
    public void reciclar() {
        System.out.println(getNome() + " está sendo reciclado.");
    }
}
