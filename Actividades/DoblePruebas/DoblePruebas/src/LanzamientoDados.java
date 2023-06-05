import java.util.random.RandomGenerator;
public class LanzamientoDados{
    private final int NUMERO_DE_LADOS = 6;
    private final NumerosAleatorios rnd ;

    public LanzamientoDados(NumerosAleatorios r){ // NumerosAleatorios r = stub = new StubNumeroAleatorio()
        this.rnd = r;
    }
    public String asText() {
        int lanzado = rnd.nextInt(NUMERO_DE_LADOS) + 1;
        return String.format("Tu lanzamiento a %d", lanzado);
    }
}