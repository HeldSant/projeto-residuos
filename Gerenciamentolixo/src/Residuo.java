
// Classe abstrata Residuo que será a base para outros tipos de resíduos
public abstract class Residuo {
    private String nome;
    private double peso;

    public Residuo(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract String getTipo();
}
