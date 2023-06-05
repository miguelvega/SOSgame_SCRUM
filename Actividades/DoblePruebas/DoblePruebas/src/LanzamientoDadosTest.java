import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LanzamientoDadosTest {
    @Test
    void producesMensage() {
        var stub = new StubNumeroAleatorio();// inyectamos un doble de prueba: una instancia de la clase
                                             // que hemos escrito específicamente para que sea fácil de usar en una prueba unitaria
        var lanzado = new LanzamientoDados(stub);
        var actual = lanzado.asText();
        assertThat(actual).isEqualTo("Tu lanzamiento a 5");
    }
}
