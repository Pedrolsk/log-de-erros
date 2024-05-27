import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    // Criação do Logger
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            // Código que pode lançar exceções
            int result = 10 / 0; // Isto lançará uma ArithmeticException
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            // Tratamento de exceção e log do erro
            logger.log(Level.SEVERE, "Erro ocorrido: ", e);
        }

        // Continuação do programa
        System.out.println("Continuação do programa...");
    }
}