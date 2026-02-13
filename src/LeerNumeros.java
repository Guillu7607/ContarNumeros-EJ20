import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumeros {
    public static void main(String[] args) {
        try {
            File archivo = new File("numeros.txt");
            Scanner scanner = new Scanner(archivo);

            System.out.println("Números en el archivo:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
