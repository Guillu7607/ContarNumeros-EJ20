import java.io.FileWriter;
import java.io.IOException;

public class EscribirNumeros {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("numeros.txt")) {
            for (int i = 1; i <= 10; i++) {
                writer.write(i + "\n");
            }
            System.out.println("Números guardados en numeros.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
