
public class Principal {
    public static void main(String[] args) {
        try {
            // Criando objetos de resíduos
            Residuo banana = new ResiduoOrganico("Banana", 0.2);
            Residuo garrafa = new ResiduoReciclavel("Garrafa PET", 0.1, "Plástico");
            Residuo pote = new ResiduoReciclavel("Pote de vidro", 0.6, "Vidro");
            

            // Criando uma lixeira e adicionando resíduos
            Lixeira lixeira = new Lixeira();
            lixeira.adicionarResiduo(banana);
            lixeira.adicionarResiduo(garrafa);
            lixeira.adicionarResiduo(pote);
            

            // Mostrando resíduos na lixeira
            System.out.println("Resíduos na lixeira:");
            lixeira.mostrarResiduos();

            // Reciclando resíduos recicláveis
            System.out.println("\nReciclando resíduos recicláveis:");
            reciclarResiduos(lixeira);

            // Tentando adicionar um resíduo inválido
            adicionarResiduoInvalido();

        } catch (TipoResiduoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para demonstrar o uso de exceção
    public static void adicionarResiduoInvalido() throws TipoResiduoInvalidoException {
        throw new TipoResiduoInvalidoException("Tipo de resíduo inválido!");
    }

    // Método que recicla resíduos recicláveis na lixeira
    public static void reciclarResiduos(Lixeira lixeira) {
        for (Residuo residuo : lixeira.getResiduos()) {
            if (residuo instanceof Reciclavel) {
                ((Reciclavel) residuo).reciclar();
            }
        }
    }
}


